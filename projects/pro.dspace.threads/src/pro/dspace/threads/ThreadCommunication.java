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
		Thread tp = new Thread(p);
		Thread tc = new Thread(c);
		tp.start();
		tc.start();

		tp.join();
		tc.join();
	}

}
