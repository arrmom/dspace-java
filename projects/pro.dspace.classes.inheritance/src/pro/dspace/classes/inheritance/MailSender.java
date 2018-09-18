package pro.dspace.classes.inheritance;

/**
 * 
 * @author mom
 *
 */
public class MailSender extends AbstractSender {

	@Override
	public String getComment() {
		return "mail";
	}

}
