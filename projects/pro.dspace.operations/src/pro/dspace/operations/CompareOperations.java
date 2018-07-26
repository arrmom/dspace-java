package pro.dspace.operations;

/**
 * 
 * @author mom
 *
 */
public class CompareOperations {

	public void execute() {
		int a = 3;
		int b = 4;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a < b = " + (a < b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a <= b = " + (a <= b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		// & | ! && || ^
		System.out.println("false & false = " + (false & false)); // AND
		System.out.println("true & false = " + (true & false));
		System.out.println("false & true = " + (false & true));
		System.out.println("true & true = " + (true & true));
		System.out.println("false | false = " + (false | false)); // OR
		System.out.println("true | false = " + (true | false));
		System.out.println("false | true = " + (false | true));
		System.out.println("true | true = " + (true | true));
		System.out.println("false ^ false = " + (false ^ false)); // XOR - исключающее или
		System.out.println("true ^ false = " + (true ^ false));
		System.out.println("false ^ true = " + (false ^ true));
		System.out.println("true ^ true = " + (true ^ true));
		System.out.println("!false = " + (!false)); // NOT
		System.out.println("!true = " + (!true));
		System.out.println("!(a < b) = " + (!(a < b)));

		int x = 3;
		int y = 1;
		boolean res = x < 2 && y++ < 10;
		System.out.println("(&&) res = " + res);
		System.out.println("y = " + y);
		res = x < 2 & y++ < 10;
		System.out.println("(&&) res 2 = " + res);
		System.out.println("y = " + y);
	}

}
