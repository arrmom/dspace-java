package pro.dspace.home.sort;

public class AntonBubbleSort implements Sort {

	@Override
	public void doAscSort(int[] data) {
		
		int i, j, temp = 0;
		for (i = 0; i < data.length - 1; i++) {
			for (j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		
	}

}
