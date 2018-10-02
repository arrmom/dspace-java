package pro.dspace.threads;

/**
 * Многопоточное программирование.
 * 
 * @author mom
 *
 */
public class ThreadsMain {

	public static void main(String[] args) {
		System.out.println("**** Threads ***");
		try {
//			new ThreadMain().execute();
//			new ExtThread().execute();
//			new RunnableThread().execute();
			new ThreadSync().execute();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
