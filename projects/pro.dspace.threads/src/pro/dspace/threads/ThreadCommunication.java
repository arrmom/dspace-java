package pro.dspace.threads;

/**
 * Взаимодействие потоков.
 * 
 * @author mom
 *
 */
public class ThreadCommunication {
	
	public void execute() throws InterruptedException {
		System.out.println("--- ThreadCommunication ---");
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		Thread tp = new Thread(p, "Producer");
		Thread tc = new Thread(c, "Consumer");
		tp.start();
		tc.start();

		tp.join(12000);
		tc.join(12000);
		if (tc.isAlive()) {
			tc.interrupt();
		}
		tc.join();
		if (tp.isAlive()) {
			tp.interrupt();
		}
		tp.join();
	}

}
