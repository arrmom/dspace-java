package pro.dspace.threads;

/**
 * 
 * @author mom
 *
 */
public class PrinterClient2 implements Runnable {

	// params
	private final Printer2 printer;

	private final String text;

	// state
	private final Thread thread;

	public PrinterClient2(Printer2 printer, String text) {
		super();
		this.printer = printer;
		thread = new Thread(this);
		thread.start();
		this.text = text;
	}

	@Override
	public void run() {
		synchronized (printer) {
			printer.printText(text);
		}
	}

}
