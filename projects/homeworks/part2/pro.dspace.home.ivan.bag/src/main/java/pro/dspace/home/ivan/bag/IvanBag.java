package pro.dspace.home.ivan.bag;

import java.util.HashMap;
import java.util.Map;

/**
 * Множество целых чисел с дубликатами.
 * 
 * @author Filin.PW
 *
 */
// TODO: сделать шаблон
public class IvanBag implements Bag<Object> {

	/** Хранилище элементов множества и информации о их количестве в этом множестве. */
	private final Map<Object, Integer> bag = new HashMap<Object, Integer>();

	@Override
	public synchronized void add(Object e) {
		// TODO: эффективность
		if (bag.containsKey(e)) {
			bag.put(e, bag.get(e) + 1);
		} else {
			bag.put(e, 1);
		}
	}

	@Override
	public synchronized boolean remove(Object e) {
		if (bag.containsKey(e)) {
			if (bag.get(e) > 1) {
				bag.put(e, bag.get(e) - 1);
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
	public synchronized int count(Object e) {
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
