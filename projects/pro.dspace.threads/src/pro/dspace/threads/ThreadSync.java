package pro.dspace.threads;

/**
 * Синхронизация потоков.
 * 
 * @author mom
 *
 */
public class ThreadSync {

	public void execute() throws InterruptedException {
		System.out.println("--- ThreadSync ---");
		Queue q = new Queue();
		Thread tc = new Thread(new Consumer(q));
		Thread tp = new Thread(new Producer(q));
		tp.start();
		tc.start();
		
		tc.join();
		tp.join();
	}

}
