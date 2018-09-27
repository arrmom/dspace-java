package pro.dspace.home.ivan.bag;

import java.util.Date;

/**
 * Пример использования множества вида Bag (Множество целых чисел с дубликатами).
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
		Bag bag = new BagIvan();
		System.out.println("bag.size() = " + bag.size());
		printLog(bag);
		System.out.println("bag.count(10) = " + bag.count(10));
		System.out.println("bag.contains(10) = " + bag.contains(10));
		bag.add(10);
		System.out.println("bag.count(10) = " + bag.count(10));
		System.out.println("bag.contains(10) = " + bag.contains(10));
		bag.add(20);
		bag.add(10);
		System.out.println("bag.count(10) = " + bag.count(10));
		System.out.println("bag.contains(10) = " + bag.contains(10));
		bag.add(30);
		bag.remove(20);
		bag.remove(20);
		bag.add(20);
		bag.remove(30);
		System.out.println("bag.count(30) = " + bag.count(30));
		System.out.println("bag.contains(30) = " + bag.contains(30));
		bag.remove(100);
		System.out.println("bag.size() = " + bag.size());
		printLog(bag);
	}

	/**
	 * Отобразить историю изменения множества.
	 * 
	 * @param bag
	 */
	private static void printLog(Bag bag) {
		System.out.println("Log:");
		if (bag.getLog().isEmpty()) {
			System.out.println(new Date().getTime() + " not changed");
		} else {
			for (String entry : bag.getLog())
				System.out.println(entry);
		}
	}

}
