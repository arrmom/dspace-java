package pro.dspace.threads;

import java.util.Date;

/**
 * 
 * @author mom
 *
 */
public class MyThread extends Thread {

	private final long pause;

	public MyThread(String name, long pause) {
		super(name);
		this.pause = pause;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; ++i) {
			System.out.println("Thread name = " + Thread.currentThread().getName() + ", id = "
					+ Thread.currentThread().getId() + " " + i + " " + (new Date()));
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {
				break; // --->
			}
		}
	}

}
