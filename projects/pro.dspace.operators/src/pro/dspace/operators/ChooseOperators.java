package pro.dspace.operators;

/**
 * Операторы выбора: if, if-else, if-else-if, switch.
 * 
 * @author mom
 *
 */
public class ChooseOperators {

	public void execute() {
		System.out.println("ifOper:");
		ifOper();
		System.out.println("ifElseOper:");
		ifElseOper();
		System.out.println("ifElseIfOper:");
		ifElseIfOper();
		System.out.println("switchOper:");
		switchOper();
	}

	private void ifOper() {
		// if (условие) опер1;
		int a = 1;
		if (a < 5 && a > 0) {
			System.out.println("OK! a < 5");
		}
		if (a > 2) {
			System.out.println("OK! a > 2");
		}
	}

	private void ifElseOper() {
		// if (условие) опер1; else опер2;
		int a = 5;
		if (a < 5 && a > 0) {
			System.out.println("OK!");
		} else {
			System.out.println("ERROR! a = " + a);
		}
	}

	private void ifElseIfOper() {
		// if (условие) опер1; else if (услов2) опер2; else if (услов3) опер3; else опер4;
		int a = 6, b = 3, c = 7;
		if (a < 5) {
			System.out.println("a < 5");
		} else if (b > 2) {
			System.out.println("b > 2");
		} else if (c < 10) {
			System.out.println("OK, c < 10");
		} else {
			System.out.println("#4");
		}
	}

	private void switchOper() {
		// switch (знач) { case знач1: опер1; break; case знач2: опер2; default: опер3; }
		byte b = 4;
		switch (b) {
		case 1:
			System.out.println("Have one");
		case 2:
			System.out.println("Have two");
			break;
		case 4:
			System.out.println("Have four");
			break;
		default:
			System.out.println("Have value " + b);
		}
	}

}
