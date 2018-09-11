package pro.dspace.home.sort;

/**
 * 
 * @author mom
 *
 */
public class AntonBubbleSort implements Sort {

	@Override
	public void doAscSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

}
