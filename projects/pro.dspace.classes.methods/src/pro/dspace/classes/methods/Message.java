package pro.dspace.classes.methods;

import java.util.Date;

/**
 * Сообщение.
 * 
 * @author mom
 *
 */
public class Message {

	private final String text;
	
	private final Date sendAt;
	
	public Message(String text, Date sendAt) {
		super();
		this.text = text;
		this.sendAt = sendAt;
	}

	public String getText() {
		return text;
	}

	public Date getSendAt() {
		return sendAt;
	}

	@Override
	public String toString() {
		return "Message [text=\"" + text + "\", sendAt=" + sendAt + "]";
	}

}
