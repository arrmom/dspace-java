package pro.dspace;

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

	/**
	 * Вывести приветствие.
	 */
	public void execute() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setLocation(100, 100);
		setSize(400, 400);
		setVisible(true);
	}
	
	@Override
    public void paint(Graphics g) {
		g.drawString("Hello, World!", 50, 50);
    }

}
