package pro.dspace.operations;

/**
 * 
 * @author mom
 *
 */
public class BitOperations {
	
	private String bin(int x) {
		return Integer.toBinaryString(x);
	}
	
	public void execute() {
		int a = 0b1111001101;
		int b = 0b1001010110;
		System.out.println("a = " + bin(a) + " (" + a + ")");
		System.out.println("b = " + bin(b) + " (" + b + ")");
		System.out.println("a & b = " + bin(a & b)); // AND
		System.out.println("a | b = " + bin(a | b)); // OR
		System.out.println("a ^ b = 0" + bin(a ^ b)); // XOR
		System.out.println("~a = " + bin(~a)); // NOT
		int[] arr = { 5, 8, 12, 11, 18 };
		System.out.println("arr:");
		for(int x: arr) {
			System.out.print(x  + " ");
		}
		System.out.println("\narr xor:");
		for(int x: arr) {
			System.out.print((x ^ a)  + " ");
		}
		System.out.println("\narr xor xor:");
		for(int x: arr) {
			System.out.print(((x ^ a) ^ a)  + " ");
		}
		System.out.println();
	}

}
