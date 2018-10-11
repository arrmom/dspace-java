package pro.dspace.generics;

/**
 * 
 * @author mom
 *
 */
public class GenMethod {

	/**
	 * Получить максимальное из двух значений.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T extends Comparable<T>> T max(T a, T b) {
		int cmp = a.compareTo(b);
		return cmp < 0 ? b : a;
	}

}
