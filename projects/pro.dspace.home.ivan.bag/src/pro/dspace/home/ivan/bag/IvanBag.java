package pro.dspace.home.ivan.bag;

import java.util.HashMap;
import java.util.Map;

/**
 * Множество целых чисел с дубликатами.
 * 
 * @author Filin.PW
 *
 */
public class IvanBag implements Bag<Object> {

	/** Хранилище элементов множества и информации о их количестве в этом множестве. */
	private Map<Object, Integer> bag = new HashMap<Object, Integer>();

	@Override
	public synchronized void add(Object e) {
		if (bag.containsKey(e)) {
			int val = bag.get(e);
			bag.put(e, ++val);
		} else {
			bag.put(e, 1);
		}
	}

	@Override
	public synchronized boolean remove(Object e) {
		if (bag.containsKey(e)) {
			if (bag.get(e) > 1) {
				int val = bag.get(e);
				bag.put(e, --val);
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
		int size = 0;
		for (int val : bag.values()) {
			size += val;
		}
		return size;
	}

	@Override
	public synchronized int count(Object e) {
		if (bag.containsKey(e)) {
			return bag.get(e);
		} else {
			return 0;
		}
	}

}
