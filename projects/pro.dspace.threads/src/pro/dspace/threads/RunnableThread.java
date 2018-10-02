package pro.dspace.threads;

/**
 * 
 * @author mom
 *
 */
public class RunnableThread {

	public void execute() throws InterruptedException {
		System.out.println("--- RunnableThread ---");
		Thread t3 = new Thread(new Executor(200), "Поток_3");
		Thread t4 = new Thread(new Executor(900), "Поток_4");
		System.out.println("1 t3.isAlive() = " + t3.isAlive());
		t3.start();
		t4.start();
		System.out.println("Запустили потоки " + t3 + ", " + t4);
		System.out.println("2 t3.isAlive() = " + t3.isAlive());
		t3.join(200);
		System.out.println("3 t3.isAlive() = " + t3.isAlive());
		if (t3.isAlive()) {
			t3.interrupt();
		}
		
		t3.join();
		t4.join();
	}

}
