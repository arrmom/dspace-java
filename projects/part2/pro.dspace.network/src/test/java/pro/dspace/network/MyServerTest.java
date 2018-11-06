package pro.dspace.network;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
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
	
	@After
	public void tearDown() {
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
		Socket s = new Socket("127.0.0.1", serv.getPort());
		OutputStream out = s.getOutputStream();
		String req = "Hello";
		out.write(req.getBytes());
		out.write(0xff);
		
		InputStream in = s.getInputStream();
		byte[] buf = new byte[10000];
		int n = in.read(buf);
		String response = "";
		while (n != -1 && n != 0) {
			response += new String(buf, 0, n);
			n = in.read(buf);
		}
		assertEquals("HHeelllloo", response);
		System.out.println("response = " + response);
		in.close();
		out.close();
		s.close();
	}
	
}
