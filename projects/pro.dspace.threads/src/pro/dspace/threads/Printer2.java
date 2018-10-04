package pro.dspace.threads;

/**
 * 
 * @author mom
 *
 */
public class Printer2 {
	
	/**
	 * 
	 * @param text
	 */
	public void printText(String text) {
		for(int i = 0; i < text.length(); ++i) {
			System.out.print(text.charAt(i));
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
			}
		}
		System.out.println();
	}

}
