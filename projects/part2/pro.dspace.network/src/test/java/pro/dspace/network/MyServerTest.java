package pro.dspace.network;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import org.junit.After;
import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class MyServerTest {
	
	private MyServer serv;
	
	private Socket socket;
	
	@After
	public void tearDown() {
		if (socket != null) {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (serv != null && serv.isStarted()) {
			serv.stop();
		}
	}

	@Test
	public void testStartStop() throws Exception {
		MyServer serv = new MyServer("Главный сервер");
		serv.start();
		assertTrue(serv.isStarted());
		int port = serv.getPort();
		assertTrue(port > 1024);
		serv.stop();
		assertFalse(serv.isStarted());
	}

	@Test
	public void testConnection() throws Exception {
		serv = new MyServer();
		serv.start();
		socket = new Socket("127.0.0.1", serv.getPort());
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		ObjectOutputStream objOut = new  ObjectOutputStream(out);
		objOut.writeObject(new GetTimeRequest());
		
		ObjectInputStream objIn = new ObjectInputStream(in);
		Object obj = objIn.readObject();
		assertTrue(obj instanceof GetTimeResponse);
		GetTimeResponse resp = (GetTimeResponse) obj;
		assertTrue(System.currentTimeMillis() - resp.getTime().getTime() < 500);
		
		String req = "Hello";
		out.write(req.getBytes());
		out.write(0xff);
		StringBuilder sb = new StringBuilder();
		int b = in.read();
		while (b != -1 && b != 0xff) {
			sb.append((char)b);
			b = in.read();
		}
		String response = sb.toString();
		assertEquals("HHeelllloo", response);
		in.close();
		out.close();
		socket.close();
	}

	@Test
	public void testRemoteConnection() throws Exception {
		socket = new Socket("www.google.com", 80);
		OutputStream out = socket.getOutputStream();
		out.write("GET www.google.com HTTP/1.1\r\n\r\n".getBytes());
		InputStream in = socket.getInputStream();
		StringBuilder sb = new StringBuilder();
		int b = in.read();
		while (b != -1 && sb.length() < 1000) {
			sb.append((char)b);
			b = in.read();
		}
		System.out.println("Google response: \n------------\n" + sb + "\n---------");
		socket.close();
	}
	
}
