package pro.dspace.testing;

import java.util.HashMap;
import java.util.Map;

/**
 * Реализация сумки по умолчанию.
 * 
 * @author mom
 *
 * @param <E>
 */
public class DefaultBag<E> implements Bag<E> {

	private final Map<E, Integer> store = new HashMap<>();

	@Override
	public int size() {
		int size = 0;
		for (int c : store.values()) {
			size += c;
		}
		return size;
	}

	@Override
	public void add(E elem) {
		Integer count = store.get(elem);
		if (count == null) {
			store.put(elem, 1);
		} else {
			store.put(elem, count + 1);
		}
	}

	@Override
	public boolean remove(E elem) {
		Integer count = store.get(elem);
		if (count == null) {
			return false;
		}
		store.put(elem, count - 1);
		return true;
	}

	@Override
	public int count(E elem) {
		Integer count = store.get(elem);
		return count == null ? 0 : count;
	}

}
