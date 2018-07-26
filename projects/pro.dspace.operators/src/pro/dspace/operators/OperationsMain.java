package pro.dspace.operators;

/**
 * Работы с управляющими операторами.
 * 
 * @author mom
 *
 */
public class OperationsMain {

	public static void main(String[] args) {
		System.out.println("ChooseOperators --");
		new ChooseOperators().execute();
		System.out.println("\n\nLoopOperators --");
		new LoopOperators().execute();
		System.out.println("\n\nGotoOperators --");
		new GotoOperators().execute();
	}

}
