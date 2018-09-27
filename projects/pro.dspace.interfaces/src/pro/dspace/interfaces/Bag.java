package pro.dspace.interfaces;

import java.util.Date;

/**
 * Множество целых чисел с дубликатами.
 * 
 * @author mom
 *
 */
public interface Bag {

	int DEFAULT_CAPACITY = 10;

	void add(int val);

	/**
	 * Удалить один экземпляр значения.
	 * 
	 * @param val
	 */
	void remove(int val);

	int size();

	default boolean isEmpty() {
		log("isEmpty()");
		return size() == 0;
	}

	boolean contains(int val);

	/**
	 * Получить число добавлений значения.
	 * 
	 * @param val
	 * @return
	 */
	int count(int val);
	
	private void log(String msg) {
		System.out.println(new Date() + ": " + msg);
	}
	
	/**
	 * 
	 * @return
	 */
	static Bag getInstance() {
		DefaultBag b = new DefaultBag();
		b.setCapacity(DEFAULT_CAPACITY);
		return b;
	}

	static Bag getFastInstance() {
		return new FastBag();
	}

}
