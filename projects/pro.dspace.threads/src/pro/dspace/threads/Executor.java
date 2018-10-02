package pro.dspace.threads;

import java.util.Date;

/**
 * 
 * @author mom
 *
 */
public class Executor implements Runnable {

	private final long pause;

	public Executor(long pause) {
		this.pause = pause;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; ++i) {
			Thread th = Thread.currentThread();
			if (th.isInterrupted()) {
				break;
			}
			System.out
					.println("Thread 2 name = " + th.getName() + ", id = " + th.getId() + " " + i + " " + (new Date()));
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {
				System.out.println(
						"Thread " + th.getName() + " has been interrupted");
				break; // --->
			}
		}
	}

}
