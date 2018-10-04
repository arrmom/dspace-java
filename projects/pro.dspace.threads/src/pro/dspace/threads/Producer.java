package pro.dspace.threads;

import java.util.Date;

/**
 * 
 * @author mom
 *
 */
public class Producer implements Runnable {
	
	private final Queue queue;
	
	public Producer(Queue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("-- Producer");
		try {
			for(int i = 0; i < 10; ++i) {
				System.out.println("" + new Date() + ": Передано " + i);
				queue.put(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Producer interrupted");
		}
	}

}
