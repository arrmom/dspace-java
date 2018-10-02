package pro.dspace.home.ivan.bag;

import java.util.List;

/**
 * Множество целых чисел с дубликатами.
 * 
 * @author mom
 *
 */
public interface Bag {

	/**
	 * Добавление элемента множества.
	 * 
	 * @param val - новый элемент или очередной экземпляр этого элемента
	 */
	void add(int val);

	/**
	 * Удалить один экземпляр значения.
	 * 
	 * @param val - элемент множества, экземпляр которого нужно удалить
	 */
	void remove(int val);

	/**
	 * Получить количество всех экземпляров всех элементов.
	 */
	int size();

	/**
	 * Проверить множество на пустоту.
	 * 
	 * @return true, если элементы отсутствуют
	 */
	default boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * Проверить наличие экземпляров элемента во множестве
	 * 
	 * @param val - элемент
	 * @return true, если экземпляры элемента присутствуют
	 */
	default boolean contains(int val) {
		return count(val) != 0;
	}

	/**
	 * Получить количество экземпляров элемента.
	 * 
	 * @param val - элемент
	 * @return количество экземпляров элемента
	 */
	int count(int val);

	/**
	 * Получить историю изменения множества.
	 */
	List<String> getLog();

	/**
	 * Получить пример объекта класса pro.dspace.home.ivan.bag.BagIvan.
	 * @return пример объекта класса pro.dspace.home.ivan.bag.BagIvan
	 */
	static Bag getInstance() {
		Bag inst = new BagIvan();
		for (int i = 0, j = 0; i <= 100; i += 10, j++) {
			for (int k = 0; k <= j; k++) {
				inst.add(i);
			}
		}
		return inst;
	}
}
