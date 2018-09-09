package pro.dspace.home.sort;

import java.util.Arrays;

public class IvanMergeSort implements Sort {

	@Override
	public void doAscSort(int[] data) {
		data = mergeSort(data);
	}
	
	private int[] mergeSort(int[] arr) {
		int[] halfSorted1, halfSorted2;
		
		if (arr.length > 1) {
			int[] temp = Arrays.copyOfRange(arr, 0, arr.length / 2);
			halfSorted1 = this.mergeSort(temp);
			temp = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
			halfSorted2 = this.mergeSort(temp);
		} else {
			return arr;
		}
		
		int posHS1 = 0;
		int posHS2 = 0;
		int step = 0;
		int[] tail = {};
		for (int i = 0; i < arr.length; i++) {
			if (halfSorted1[posHS1] < halfSorted2[posHS2]) {
				arr[i] = halfSorted1[posHS1];
				posHS1++;
			} else {
				arr[i] = halfSorted2[posHS2];
				posHS2++;
			}
			if (posHS1 == halfSorted1.length) {
				step = i;
				tail = Arrays.copyOfRange(halfSorted2, posHS2, halfSorted2.length);
				break;
			}
			if (posHS2 == halfSorted2.length) {
				step = i;
				tail = Arrays.copyOfRange(halfSorted1, posHS1, halfSorted1.length);
				break;
			}
		}

		for (int element : tail) {
			arr[++step] = element;
		}

		return arr;
	}
}
