package pro.dspace.home.sort;

/**
 * ������� ���������� �������.
 * 
 * @author Filin.PW
 *
 */
public class IvanQuickSort implements Sort{
	
	/**
	 * ����������� ������ �� �����������
	 * @param data - ������
	 */
	@Override
	public void doAscSort(int[] data) {
		quickSort(data, 0, data.length - 1);		
	}

	/**
	 * ����������� �������� ����������
	 * @param arr - ������
	 * @param begin - ������ ������� �������� ����������
	 * @param end - ������ ���������� �������� ����������
	 */
	private void quickSort(int[] arr, int begin, int end) {
		if (end - begin < 1) {
			return;
		}
		
		int mid = arr[(end - begin) / 2 + begin]; 
		int i = begin;
		int j = end;
		
		do {
			while (arr[i] < mid) i++;
			while (arr[j] > mid) j--;
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		} while(i <= j);

		if (i < end) {
			quickSort(arr, i, end);
		}
		if (j > begin) {
			quickSort(arr, begin, j);

		}	
	}

}
