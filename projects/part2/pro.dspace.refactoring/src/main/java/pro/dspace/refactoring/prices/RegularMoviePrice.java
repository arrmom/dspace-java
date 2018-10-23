package pro.dspace.refactoring.prices;

import pro.dspace.refactoring.MoviePrice;
import pro.dspace.refactoring.Rental;

/**
 * 
 * @author mom
 *
 */
public class RegularMoviePrice implements MoviePrice {

	@Override
	public double getCharge(Rental rental) {
		double result = 2;
		if (rental.getDaysRented() > 2) {
			result += (rental.getDaysRented() - 2) * 15;
		}
		return result;
	}

}
