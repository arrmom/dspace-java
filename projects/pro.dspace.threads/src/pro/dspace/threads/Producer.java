package pro.dspace.threads;

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
		for(int i = 0; i < 100; ++i) {
			queue.add(i);
		}
	}

}
