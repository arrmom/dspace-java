package pro.dspace.types;

/**
 * 
 * @author mom
 *
 */
public class PrimitiveTypes {

	private byte test;

	/**
	 * 
	 */
	public void execute() {
		System.out.println("--- int numbers ------");
		intNumbers();
		System.out.println("--- real numbers ------");
		realNumbers();
		System.out.println("--- boolean ------");
		testBoolean();
	}

	private void intNumbers() {
		byte month = 10;
		short shortVar = (short) (month * 100);
		int index = -234234;
		long time = 12312342343L;

		System.out.println("test = " + test);
		System.out.println("month = " + month);
		System.out.println("shortVar = " + shortVar);
		System.out.println("index = " + index);
		System.out.println("time = " + time);
		System.out.println("----------");

		System.out.println("byte range = [" + Byte.MIN_VALUE + ", " + Byte.MAX_VALUE + "]");
		System.out.println("short range = [" + Short.MIN_VALUE + ", " + Short.MAX_VALUE + "]");
		System.out.println("int range = [" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + "]");
		System.out.println("long range = [" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + "]");
		
		System.out.println("3 % 2 = " + (3 % 2));
		System.out.println("3 / 2 = " + (3 / 2));
	}
	
	private void realNumbers() {
		float x = 3.5f;
		double y = 4.56;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("y / 3 = " + (y / 3));
		System.out.println("sin(PI / 2) = " + Math.sin(Math.PI / 2));
	}

	private void testBoolean() {
		boolean b = true;
		boolean a = 2 < 3;
		System.out.println("b = " + b);
		System.out.println("a = " + a);
		System.out.println("4 > 6 = " + (4 > 6));
		if (!b) {
			System.out.println("Hello!! b is true");
		}
	}

	private void testChar() {
		// TODO
	}
	
}
