package pro.dspace.refactoring.prices;

import pro.dspace.refactoring.MoviePrice;
import pro.dspace.refactoring.Rental;

/**
 * 
 * @author mom
 *
 */
public class ChildrensMoviePrice implements MoviePrice {

	/**
	 * 
	 */
	private static final int MY_CONSTANT = 15;

	@Override
	public double getCharge(Rental rental) {
		double result = MY_CONSTANT;
		if (rental.getDaysRented() > 3) {
			result += (rental.getDaysRented() - 3) * MY_CONSTANT;
		}
		return result;
	}

}
