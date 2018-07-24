package pro.dspace.operations;

/**
 * 
 * @author mom
 *
 */
public class ArithmOperations {
	
	public void execute() {
		int a = 5;
		int b = 6;
		float c = 22.25f;
		float d = 5;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("c % d = " + (c % d));
		
		// ++, --
		System.out.println("--- inc/dec ---");
		System.out.println("1 a = " + a);
		++a; // a = a + 1
		// a++ ----- (x = a; a = a + 1; return x)
		System.out.println("2 a = " + a);
		System.out.println("++a = " + (++a));
		System.out.println("a++ = " + (a++));
		System.out.println("a = " + a);
		System.out.println("--");
		System.out.println("1 b = " + b);
		--b;
		System.out.println("2 b = " + b);
		System.out.println("--b = " + (--b));
		System.out.println("b-- = " + (b--));
		System.out.println("b = " + b);
		System.out.println("--");
		a = 10;
		System.out.println("a = " + a);
		a *= 3; // a = a * 3
		System.out.println("a *= 3 = " + a);
	}

}
