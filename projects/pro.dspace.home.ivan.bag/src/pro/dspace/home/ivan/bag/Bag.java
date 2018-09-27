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
	 * Добавление члена множества.
	 * 
	 * @param val - новый член множества или очередной экземпляр этого члена
	 */
	void add(int val);

	/**
	 * Удалить один экземпляр значения.
	 * 
	 * @param val - член множества, экземпляр которого нужно удалить
	 */
	void remove(int val);

	/**
	 * Получить количество всех экземпляров всех членов.
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

}
