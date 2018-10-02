package pro.dspace.threads;

import java.util.Date;

/**
 * Главный поток.
 * 
 * @author mom
 *
 */
public class ThreadMain {

	public void execute() {
		Thread thread = Thread.currentThread();
		System.out.println("Main thread = " + thread);
		System.out.println("Main thread name = " + thread.getName());
		System.out.println("Main thread id = " + thread.getId());
		System.out.println("Main thread state = " + thread.getState());
		System.out.println("Before sleep " + (new Date()));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("After sleep " + (new Date()));
		thread.setName("My Thread");
		System.out.println("Main thread name 2 = " + thread.getName());
	}

}
