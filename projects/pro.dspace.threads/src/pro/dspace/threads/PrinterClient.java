package pro.dspace.threads;

/**
 * 
 * @author mom
 *
 */
public class PrinterClient implements Runnable {

	// params
	private final Printer printer;

	private final String text;

	// state
	private final Thread thread;

	public PrinterClient(Printer printer, String text) {
		super();
		this.printer = printer;
		thread = new Thread(this);
		thread.start();
		this.text = text;
	}

	@Override
	public void run() {
		printer.printText(text);
	}
	
	/**
	 * 
	 * @throws InterruptedException
	 */
	public void waitDone() throws InterruptedException {
		thread.join();
	}

}
