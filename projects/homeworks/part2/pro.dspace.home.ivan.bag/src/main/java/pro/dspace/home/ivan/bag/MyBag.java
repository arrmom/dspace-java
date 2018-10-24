package pro.dspace.home.ivan.bag;

import java.util.HashMap;
import java.util.Map;

/**
 * Множество целых чисел с дубликатами.
 * 
 * @author Ivan Nosov
 *
 */
public class MyBag implements Bag<Integer> {

	/** Хранилище элементов множества и информации о их количестве в этом множестве. */
	private final Map<Integer, Integer> bag = new HashMap<Integer, Integer>();

	@Override
	public synchronized void add(Integer e) {
		if (bag.containsKey(e)) {
			bag.put(e, bag.get(e) + 1);
		} else {
			bag.put(e, 1);
		}
	}

	@Override
	public synchronized boolean remove(Integer e) {
		if (bag.containsKey(e)) {
			int amoE = bag.get(e);
			if (amoE > 1) {
				bag.put(e, --amoE);
			} else {
				bag.remove(e);
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public synchronized int size() {
		int resultSize = 0;
		for (int val : bag.values()) {
			resultSize += val;
		}
		return resultSize;
	}

	@Override
	public synchronized int count(Integer e) {
		if (bag.containsKey(e)) {
			return bag.get(e);
		} else {
			return 0;
		}
	}

	@Override
	public synchronized boolean isEmpty() {
		return bag.isEmpty();
	}

}
