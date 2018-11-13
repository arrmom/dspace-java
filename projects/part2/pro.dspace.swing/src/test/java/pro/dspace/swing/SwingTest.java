package pro.dspace.swing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.junit.After;
import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class SwingTest {

	private JFrame frame;

	private volatile boolean buttonPressed;

	private volatile String enteredText;

	@After
	public void tearDown() {
		if (frame != null) {
			try {
				frame.dispose();
			} catch (Exception e) {
			}
		}
	}

	private void createWindow() {
		frame = new JFrame("Приложение");
		frame.setSize(600, 400);
		frame.setLocation(400, 300);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		frame.setVisible(true);
	}

	/**
	 * 
	 * @param timeout таймаут в мс
	 * @throws InterruptedException
	 */
	private void awaitButtonPressed(long timeout) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		while (!buttonPressed && System.currentTimeMillis() - startTime < timeout) {
			Thread.sleep(100);
		}
		assertTrue(buttonPressed);
	}

	private void awaitText(long timeout, String expected) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		while (enteredText == null && System.currentTimeMillis() - startTime < timeout) {
			Thread.sleep(100);
		}
		assertEquals(expected, enteredText);
	}

	@Test
	public void testButton() throws Exception {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createWindow();
				JLabel label = new JLabel("Нажмите кнопку");
				frame.add(label);
				JButton but = new JButton("Кнопка");
				frame.add(but);
				but.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						buttonPressed = true;
					}
				});
			}
		});
		Thread.sleep(1000);

		awaitButtonPressed(5000);

		frame.dispose();
	}

	@Test
	public void testTextField() throws Exception {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createWindow();
				JLabel label = new JLabel("Введите слово Hello");
				frame.add(label);
				JTextField textField = new JTextField();
				textField.setColumns(30);
				frame.add(textField);
				textField.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
			        	enteredText = textField.getText();
					}
				});
			}
		});
		Thread.sleep(1000);

		awaitText(5000, "Hello");

		frame.dispose();
	}

}
