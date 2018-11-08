package pro.dspace.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author mom
 *
 */
public class MyServer {

	private final String name;

	private boolean started;

	private Thread listenerThread;

	private volatile boolean stopSignal;

	private ServerSocket serverSocket;

	private static int numServ = 0;

	public MyServer() {
		this("server" + (numServ++));
	}

	public MyServer(String name) {
		this.name = name;
	}

	/**
	 * @throws IOException
	 * 
	 */
	public void start() throws IOException {
		if (started) {
			throw new IllegalStateException("The server is already started");
		}
		listenerThread = new Thread(new Runnable() {
			@Override
			public void run() {
				runListenerLoop();
			}
		}, "MyServer-" + name);
		serverSocket = new ServerSocket(0);
		listenerThread.start();
		started = true;
	}

	/**
	 * 
	 * @return
	 */
	public int getPort() {
		if (!started) {
			throw new IllegalStateException("The server should be started");
		}
		return serverSocket.getLocalPort();
	}

	public void stop() {
		if (!started) {
			throw new IllegalStateException("The server is already stopped");
		}
		synchronized (this) {
			stopSignal = true;
			notifyAll();
		}
		try {
			serverSocket.close();
			listenerThread.join();
		} catch (IOException e) {
		} catch (InterruptedException e) {
		}
		stopSignal = false;
		started = false;
		serverSocket = null;
		listenerThread = null;
	}

	public boolean isStarted() {
		return started;
	}

	private void runListenerLoop() {
		System.out.println("Started thread (" + name + ")");
		ExecutorService executor = Executors.newFixedThreadPool(5);
		while (!stopSignal) {
			try {
				Socket socket = serverSocket.accept();
				System.out.println("Accepted socket " + socket);
				executor.execute(new Runnable() {
					@Override
					public void run() {
						try {
							handleConnection(socket);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			} catch (IOException e1) {
				// e1.printStackTrace();
				break; // --->
			}

			synchronized (this) {
				try {
					wait(10);
				} catch (InterruptedException e) {
					break; // ------>
				}
			}
		}
		System.out.println("Stopped thread (" + name + ")");
	}

	private void handleConnection(Socket socket) throws IOException, InterruptedException, ClassNotFoundException {
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		ObjectInputStream objIn = new ObjectInputStream(in);
		Object obj = objIn.readObject();
		if (obj instanceof GetTimeRequest) {
			System.out.println("Accepted request " + obj);
			GetTimeResponse resp = new GetTimeResponse();
			resp.setTime(new Date());
			ObjectOutputStream objOut = new  ObjectOutputStream(out);
			objOut.writeObject(resp);
		} else {
			// TODO
			System.out.println("Unknown request object " + obj);
		}
		
		int b = in.read();
		while (b != -1 && b != 0xff) {
			out.write(b);
			out.write(b);
			b = in.read();
		}
		out.write(0xff);
		// Thread.sleep(100);
		out.close();
		in.close();
		socket.close();
	}
	

}
