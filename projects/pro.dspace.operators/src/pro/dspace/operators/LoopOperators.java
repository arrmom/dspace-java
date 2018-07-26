package pro.dspace.operators;

/**
 * Операторы цикла: while, do-while, for.
 * 
 * @author mom
 *
 */
public class LoopOperators {

	public void execute() {
		System.out.println("whileOper:");
		whileOper();
		System.out.println("\nforOper:");
		forOper();
		System.out.println("\ndoWhile:");
		doWhile();
	}

	private void whileOper() {
		// while (условие) опер;
		int a = 10;
		while (a > 0) {
			System.out.println("a = " + a);
			--a;
		}
	}

	private void forOper() {
		// for(инициализация; условие; повтор) опер;
		// 1 - init
		// 2 if (cond) oper;
		// 3 repeat
		// 4 if (cond) oper;
		int i, x;
		for(i = 0, x = 6; i < 15; ++i, x += 2) {
			System.out.print(i*i + ":" + x + " ");
		}
		System.out.println();
		System.out.println("i = " + i);
		System.out.println("x = " + x);
		boolean done = false;
		long c = 8;
		for(;!done;) {
			System.out.println("c = " + c);
			c *= 2;
			if (c > 1000) {
				done = true;
			}
		}
	}

	private void doWhile() {
		// TODO Auto-generated method stub
		System.out.println("TODO");
	}

}
