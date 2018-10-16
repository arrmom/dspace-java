package pro.dspace.testing;

/**
 * Множество с дубликатами (сумка).
 * 
 * @author mom
 *
 */
public interface Bag<E> {

	/**
	 * Получить размер множества.
	 * 
	 * @return
	 */
	int size();

	/**
	 * Проверить, пуста ли сумка.
	 * 
	 * @return
	 */
	default boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * Добавить элемент.
	 * 
	 * @param elem
	 */
	void add(E elem);

	/**
	 * Удалить элемент.
	 * 
	 * @param elem
	 * @return был или нет удален
	 */
	boolean remove(E elem);

	/**
	 * 
	 * @param elem
	 * @return число элементов
	 */
	int count(E elem);

	/**
	 * Проверить, содержит ли сумка элемент.
	 * 
	 * @param elem
	 * @return
	 */
	default boolean contains(E elem) {
		return count(elem) > 0;
	}

}
