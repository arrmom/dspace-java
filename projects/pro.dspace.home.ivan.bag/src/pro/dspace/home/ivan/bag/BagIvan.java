package pro.dspace.home.ivan.bag;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;

/**
 * Множество целых чисел с дубликатами.
 * 
 * @author Filin.PW
 *
 */
public class BagIvan implements Bag {
	/**
	 * Количество ячеек с информацией о элементе множества.
	 * <ul>
	 * <li>ячейка 0 - элемент множества;</li>
	 * <li>ячейка 1 - количество экземпляров во множестве.</li>
	 * </ul>
	 */
	private final int AMO_INFORMATION_CELLS = 2;

	/** Хранилище элементов множества и информации о их количестве в этом множестве. */
	private int[][] bag = null;

	/** История изменения множества. */
	private List<String> log = new ArrayList<String>();

	@Override
	public void add(int val) {
		/** Информация для записи в историю изменения множества */
		String entry = new Date().getTime() + " add " + val;

		if (bag != null) {
			for (int i = 0; i < bag.length; i++) {
				if (bag[i][0] == val) {
					bag[i][1]++;
					log.add(entry);
					return;
				}
			}

			final int oldBag[][] = bag.clone();
			for (int i = 0; i < bag.length; i++) {
				oldBag[i] = bag[i].clone();
			}

			bag = new int[oldBag.length + 1][AMO_INFORMATION_CELLS];
			for (int i = 0; i < oldBag.length; i++) {
				bag[i][0] = oldBag[i][0];
				bag[i][1] = oldBag[i][1];
			}
			bag[bag.length - 1][0] = val;
			bag[bag.length - 1][1] = 1;

			log.add(entry);
		} else {
			bag = new int[1][AMO_INFORMATION_CELLS];
			bag[0][0] = val;
			bag[0][1] = 1;

			log.add(entry);
		}
	}

	@Override
	public void remove(int val) {
		if (bag != null) {
			for (int i = 0; i < bag.length; i++) {
				if (bag[i][0] == val) {
					if ((bag[i][1] > 0)) {
						bag[i][1]--;
						log.add(new Date().getTime() + " rem " + val);
					}
					break;
				}
			}
		}
	}

	@Override
	public int size() {
		if (bag == null) {
			return 0;
		} else {
			int amoItems = 0;
			for (int[] infoItem : bag) {
				amoItems += infoItem[1];
			}
			return amoItems;
		}
	}

	@Override
	public int count(int val) {
		int count = 0;
		if (bag != null) {
			for (int i[] : bag) {
				if (i[0] == val) {
					count = i[1];
					break;
				}
			}
		}
		return count;
	}

	@Override
	public List<String> getLog() {
		return log;
	}
}
