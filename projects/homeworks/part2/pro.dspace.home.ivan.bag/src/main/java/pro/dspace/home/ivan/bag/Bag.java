package pro.dspace.home.ivan.bag;

/**
 * Потокобезопасное множество с дубликатами.
 * 
 * @author Ivan Nosov
 *
 */
public interface Bag<E> {

	/**
	 * Добавление элемента множества.
	 * 
	 * @param e новый элемент или очередной экземпляр этого элемента
	 */
	void add(E e);

	/**
	 * Удалить один экземпляр значения.
	 * 
	 * @param e элемент множества, экземпляр которого нужно удалить
	 */
	boolean remove(E e);

	/**
	 * Получить количество всех экземпляров всех элементов.
	 */
	int size();

	/**
	 * Проверить множество на пустоту.
	 * 
	 * @return true, если элементы отсутствуют
	 */
	boolean isEmpty();

	/**
	 * Проверить наличие экземпляров элемента во множестве
	 * 
	 * @param e элемент
	 * @return true, если экземпляры элемента присутствуют
	 */
	default boolean contains(E e) {
		return count(e) != 0;
	}

	/**
	 * Получить количество экземпляров элемента.
	 * 
	 * @param e элемент
	 * @return количество экземпляров элемента
	 */
	int count(E e);

}
