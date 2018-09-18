package pro.dspace.classes.methods;

/**
 * Аргументы переменной длины.
 * 
 * @author mom
 *
 */
public class VarArgsTest {

	public static void main(String[] args) {
		System.out.println("VarArgsTest");
		print("Msg1", 2, 3, 5);
		print("Msg2", -1, 8, 20, 100);
		print("Msg3");
		print("Msg4", new int[] { 4, 7, 8});
		print("Msg5", null);
	}

	/**
	 * 
	 * @param msg
	 * @param values
	 */
	public static void print(String msg, int... values) {
		if (values == null) {
			System.out.println(msg);
			return; // ------>
		}
		System.out.print(msg + " (vnum = " + values.length + "): ");
		boolean first = true;
		for(int v: values) {
			if (!first) {
				System.out.print(", ");
			}
			System.out.print(v);
			first = false;
		}
		System.out.println(".");
	}

}
