package pro.dspace.types;

import java.nio.charset.Charset;

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
		System.out.println("--- char ------");
		testChar();
	}

	private void intNumbers() {
		byte month = 10;
		short shortVar = (short) (month * 100);
		int index = -234234;
		long time = 12312342343L;
		
		long code = 0x123ff;
		
		int code2 = 0b111000;

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
		
		System.out.println("code = " + code + ", hex = " + Long.toHexString(code));
		
		System.out.println("code2 = " + code2 + ", bin = " + Integer.toBinaryString(code2));
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
		char a = 'a';
		char b = 'П';
		char c = '+';
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println("---------");
		for(char ch = 32; ch < 1100; ++ch) {
			System.out.print("" + ((int) ch) + " " + ch + "  ");
			if ((ch % 20) == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		String s = "Hello!";
		for(int i = 0; i < s.length(); ++i) {
			System.out.println("pos " + i + ", " + s.charAt(i));
		}
		
		s += b;
		System.out.println("s = " + s);
		System.out.println("current charset = " + Charset.defaultCharset());
	}
	
}
