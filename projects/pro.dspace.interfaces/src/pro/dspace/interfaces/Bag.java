package pro.dspace.interfaces;

/**
 * Множество целых чисел с дубликатами.
 * 
 * @author mom
 *
 */
public interface Bag {

	void add(int val);

	/**
	 * Удалить один экземпляр значения.
	 * 
	 * @param val
	 */
	void remove(int val);

	int size();

	default boolean isEmpty() {
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

}
