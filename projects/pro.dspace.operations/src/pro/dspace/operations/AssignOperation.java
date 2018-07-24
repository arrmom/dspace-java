package pro.dspace.operations;

/**
 * 
 * @author mom
 *
 */
public class AssignOperation {
	
	public void execute() {
		long x = 1;
		long y = 2;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		x = y;
		System.out.println("x = " + x);
		System.out.println("y = 10 + x = " + (y = 10 + x));
		System.out.println("y = " + y);
	}

}
