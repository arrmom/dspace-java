package pro.dspace.home.sort;


public class IvanBubbleSort implements Sort {

	@Override
	public void doAscSort(int[] data) {
		for (int step = 0; step < data.length - 1; step++) {
			for (int i = 0; i < data.length - 1; i++) {
				if (data[i] > data[i + 1]) {
					int temp = data[i + 1];
					data[i + 1] = data[i];
					data[i] = temp;
				}
			}
		}

	}
	
}
