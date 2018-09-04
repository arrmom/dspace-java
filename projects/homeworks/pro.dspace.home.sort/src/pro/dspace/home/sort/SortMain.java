package pro.dspace.home.sort;

import java.util.Arrays;

/**
 * 
 * @author mom
 *
 */
public class SortMain {

	public static void main(String[] args) {
		check(new AntonMergeSort());
		check(new XMergeSort());
		check(new XBubbleSort());
		check(new XQuickSort());
		check(new IvanBubbleSort());
	}
	
	private static void check(Sort sort) {
		System.out.println("Checking " + sort.getClass().getSimpleName() + " .. ");
		int[] arr = { 5, 1, 8, 4 };
		int[] sarr = { 1, 4, 5, 8};
		sort.doAscSort(arr);
		for(int a: arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		if (Arrays.equals(arr, sarr)) {
			System.out.println("OK!");
		} else {
			System.out.println("ERROR!");
		}
	}

}
