package pro.dspace.threads;

import java.util.Date;

/**
 * 
 * @author mom
 *
 */
public class Consumer implements Runnable {
	
	private final Queue queue;
	
	public Consumer(Queue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("-- Consumer");
		try {
			for(int i = 0; i < 10; ++i) {
				System.out.println("" + new Date() + ": Получено " + queue.get() + "\n");
			}
		} catch (InterruptedException e) {
			System.out.println("Producer interrupted");
		}
	}

}
