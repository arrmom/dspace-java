package pro.dspace.types;

import java.util.Arrays;

/**
 * Работа с массивами.
 * 
 * @author mom
 *
 */
public class LearnArrays {

	/**
	 * 
	 */
	public void execute() {
		testOneDimArrays();
		testTwoDimArrays();
	}

	private void testOneDimArrays() {
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("months.length = " + daysInMonth.length);

		for (int i = 0; i < daysInMonth.length; ++i) {
			System.out.println("months[" + i + "] = " + daysInMonth[i]);
		}

		String[] names = { "Bill", "Jack" };
		printStrings(names);

		System.out.println("names = " + Arrays.toString(names));

		float[] weights = new float[0];
		System.out.println("weights.length = " + weights.length);

		// копирование по ссылки
		String[] namesCopy = names;
		namesCopy[0] = "John";
		printStrings(names);
		// копирование элементов
		namesCopy = Arrays.copyOf(names, names.length);
		namesCopy[1] = "Jane";
		System.out.println("names: ");
		printStrings(names);
		System.out.println("namesCopy: ");
		printStrings(namesCopy);
		
		String[] namesClone = names.clone();
		System.out.println("namesClone: ");
		printStrings(namesClone);
	}

	private void printStrings(String[] strings) {
		for (int i = 0; i < strings.length; ++i) {
			System.out.println(strings[i] + " ");
		}
	}

	private void testTwoDimArrays() {
		int[][] mulTable = new int[10][10];
		for(int i = 0; i < 10; ++i) {
			for(int j = 0; j < 10; ++j) {
				mulTable[i][j] = i * j;
			}
		}
		
		System.out.println("mulTable:"); 
		for(int i = 1; i < 10; ++i) {
			for(int j = 1; j < 10; ++j) {
				System.out.print(mulTable[i][j] + " ");
			}
			System.out.println();
		}
	}

}
