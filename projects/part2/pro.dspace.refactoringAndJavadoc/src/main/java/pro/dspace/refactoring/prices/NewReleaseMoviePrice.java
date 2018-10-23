package pro.dspace.refactoring.prices;

import pro.dspace.refactoring.MoviePrice;
import pro.dspace.refactoring.Rental;

/**
 * 
 * @author mom
 *
 */
public class NewReleaseMoviePrice implements MoviePrice {

	@Override
	public double getCharge(Rental rental) {
		return rental.getDaysRented() * 3;
	}

}
