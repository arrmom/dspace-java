package pro.dspace.classes.inheritance;

/**
 * Наследование классов.
 * 
 * @author mom
 *
 */
public class InheritanceMain {

	public static void main(String[] args) {
		new SimpleInheritance().execute();
		new Super().execute();
		MailSender sender = new MailSender();
		sender.send();
	}

}
