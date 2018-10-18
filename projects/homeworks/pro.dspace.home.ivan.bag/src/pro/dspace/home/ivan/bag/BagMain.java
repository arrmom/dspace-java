package pro.dspace.home.ivan.bag;

/**
 * Пример использования множества вида Bag.
 * 
 * @author Filin.PW
 *
 */
public class BagMain {

	/**
	 * Запустить приложение.
	 * 
	 * @param args - набор входных параметров
	 */
	public static void main(String[] args) {
		Bag<Object> bag = new IvanBag();
		Character testObject0 = '0';
		Integer testObject10 = 10;
		String testObject20 = "20";

		System.out.println("Объект отсутствует:");
		System.out.println("bag.size(): " + bag.size());
		System.out.println("bag.count(testObject0) = " + bag.count(testObject0));
		System.out.println();

		bag.add(testObject10);
		System.out.println("Добавлен 1 экземпляр:");
		System.out.println("bag.size(): " + bag.size());
		System.out.println("bag.count(testObject10) = " + bag.count(testObject10));
		System.out.println();

		bag.add(testObject20);
		bag.add(testObject20);
		System.out.println("Добавлено 2 одинаковых экземпляра:");
		System.out.println("bag.size(): " + bag.size());
		System.out.println("bag.count(testObject20) = " + bag.count(testObject20));
		System.out.println();

		System.out.println("Удаление экземпляра testObject20: " + bag.remove(testObject20));
		System.out.println("bag.size(): " + bag.size());
		System.out.println("bag.count(testObject20) = " + bag.count(testObject20));
		System.out.println();

		System.out.println("Удаление последнего экземпляра testObject20: " + bag.remove(testObject20));
		System.out.println("bag.size(): " + bag.size());
		System.out.println("bag.count(testObject20) = " + bag.count(testObject20));
		System.out.println();

		System.out.println("Попытка удаления отсутствующего экземпляра testObject20: " + bag.remove(testObject20));
		System.out.println("bag.size(): " + bag.size());
		System.out.println("bag.count(testObject20) = " + bag.count(testObject20));
		System.out.println();
	}

}
