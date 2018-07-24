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
		
		// for-each стиль
		System.out.println("for-each iteration:");
		int i = 0;
		for(int val: daysInMonth) {
			System.out.println("val[" + i + "] = " + val);
			++i;
		}
	}

	private void printStrings(String[] strings) {
		for (int i = 0; i < strings.length; ++i) {
			System.out.println(strings[i] + " ");
		}
	}

	private void testTwoDimArrays() {
		int[][] mulTable = new int[10][8];
		for(int i = 0; i < mulTable.length; ++i) {
			for(int j = 0; j < mulTable[i].length; ++j) {
				mulTable[i][j] = i * j;
			}
		}
		
		System.out.println("mulTable:"); 
		for(int i = 1; i < mulTable.length; ++i) {
			for(int j = 1; j < mulTable[i].length; ++j) {
				System.out.print(mulTable[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] table = new int[3][];
		table[0] = new int[3];
		table[1] = new int[4];
		table[2] = new int[7];
		for(int i = 0; i < table.length; ++i) {
			for(int j = 0; j < table[i].length; ++j) {
				table[i][j] = i + j;
			}
		}
		System.out.println("table:");
		for(int i = 0; i < table.length; ++i) {
			for(int j = 0; j < table[i].length; ++j) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		//
		float[][] table2 = { { 1, 2 }, {3, 4} };
		System.out.println("table2:");
		for(int i = 0; i < table2.length; ++i) {
			for(int j = 0; j < table2[i].length; ++j) {
				System.out.print(table2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
