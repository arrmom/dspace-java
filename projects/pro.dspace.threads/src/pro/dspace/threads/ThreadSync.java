package pro.dspace.threads;

/**
 * Синхронизация потоков.
 * 
 * @author mom
 *
 */
public class ThreadSync {

	@SuppressWarnings("unused")
	public void execute() throws InterruptedException {
		System.out.println("--- ThreadSync ---");
		Printer printer = new Printer();
		PrinterClient pc2 = new PrinterClient(printer, "Привет, Мир!");
		PrinterClient pc1 = new PrinterClient(printer, "Hello, World!");
		
		Thread.sleep(500);
		
		pc2.waitDone(); // важно ожидать !!
		pc1.waitDone();
		
		System.out.println("--- ThreadSync 2 ---");
		
		Printer2 printer2 = new Printer2();
		PrinterClient2 pc22 = new PrinterClient2(printer2, "Как дела?");
		PrinterClient2 pc12 = new PrinterClient2(printer2, "How do you do?");
		
		Thread.sleep(500);
	}

}
