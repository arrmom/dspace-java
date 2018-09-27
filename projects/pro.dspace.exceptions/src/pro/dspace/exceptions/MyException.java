package pro.dspace.exceptions;

/**
 * 
 * @author mom
 *
 */
public class MyException extends Exception {
	
	private static final long serialVersionUID = 4297148256799066481L;

	private final int value;
	
	private final String name;

	public MyException(int value, String name) {
		super();
		this.value = value;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

}
