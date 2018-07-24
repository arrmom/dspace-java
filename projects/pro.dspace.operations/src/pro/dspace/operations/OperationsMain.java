package pro.dspace.operations;

/**
 * 
 * @author mom
 *
 */
public class OperationsMain {

	public static void main(String[] args) {
		System.out.println("ArithmOperations ----");
		new ArithmOperations().execute();
		System.out.println("BitOperations ----");
		new BitOperations().execute();
		System.out.println("CompareOperations ----");
		new CompareOperations().execute();
		System.out.println("QuestionOperation ----");
		new QuestionOperation().execute();
		System.out.println("AssignOperation");
		new AssignOperation().execute();
	}

}
