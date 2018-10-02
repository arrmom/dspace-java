package pro.dspace.threads;

public class ExtThread {
	
	public void execute() throws InterruptedException {
		System.out.println("--- ExtThread ---");
		MyThread t1 = new MyThread("Поток_1", 300);
		MyThread t2 = new MyThread("Поток_2", 1000);
		System.out.println("t1 = " + t1.getState());
		System.out.println("t2 = " + t2.getState());
		t1.start();
		t2.start();
		t1.join(); // ожидаем остановку
		t2.join(); // ожидаем остановку
	}

}
