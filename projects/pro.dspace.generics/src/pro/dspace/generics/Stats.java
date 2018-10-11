package pro.dspace.generics;

import java.util.Arrays;

/**
 * Расчет статистики.
 * 
 * @author mom
 *
 */
public class Stats<T extends Number> {

	private T[] values;

	@SuppressWarnings("unchecked")
	public Stats(T... values) {
		this.values = Arrays.copyOf(values, values.length);
	}

	public double average() {
		double sum = 0;
		for (T val : values) {
			sum += val.doubleValue();
		}
		return sum / values.length;
	}
	
	/**
	 * 
	 * @param stats
	 * @return
	 */
	public boolean sameAverageAs(Stats<? extends Double> stats) {
		return average() == stats.average();
	}

}
