package pro.dspace.threads;

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
		for(int i = 0; i < 100; ++i) {
			System.out.println("Read " + i + ", val = " + queue.get());
		}
	}

}
