package pro.dspace.classes.inheritance;

/**
 * 
 * @author mom
 *
 */
public abstract class AbstractSender {	
	int i;
	
	public void send() {
		System.out.println(getComment() + ": i = " + i);
	}
	
	public abstract String getComment(); 

}
