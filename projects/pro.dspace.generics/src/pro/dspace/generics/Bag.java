package pro.dspace.generics;

/**
 * Потокобезопасное (thread-safe) множество с дубликатами.
 * 
 * @author mom
 *
 */
public interface Bag<E> {

	/**
	 * 
	 * @return
	 */
	int size();

	/**
	 * 
	 * @return
	 */
	default boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * 
	 * @param e
	 */
	void add(E e);

	/**
	 * 
	 * @param e
	 * @return был удален или нет
	 */
	boolean remove(E e);

	/**
	 * 
	 * @param e
	 * @return
	 */
	int count(E e);

	/**
	 * 
	 * @param e
	 * @return
	 */
	boolean contains(E e);

}
