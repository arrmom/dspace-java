package pro.dspace;

import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Приветствие в окне.
 * 
 * @author mom
 *
 */
public class HelloWorldWin extends Frame {

	private static final long serialVersionUID = -5262411357794917136L;
	private static int amoObjectsCreated = 0;
	public final int numberObject;

	HelloWorldWin() {
		amoObjectsCreated++;
		this.numberObject = amoObjectsCreated;
	}

	/**
	 * Вывести приветствие.
	 */
	public void execute() {
		Date date = new Date();
		final Random random = new Random(date.getTime());

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setLocation(this.numberObject * 35, this.numberObject * 35);
		setSize(150 + random.nextInt(200), 100 + random.nextInt(200));
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		Date date = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("hh:mm:ss");

		g.drawString("Hello, World!", 50, 50);
		g.drawString("� " + this.numberObject + ", Time: " + formatDate.format(date), 10, 70);
	}
}
