package pro.dspace.refactoring;

import pro.dspace.refactoring.prices.ChildrensMoviePrice;
import pro.dspace.refactoring.prices.NewReleaseMoviePrice;
import pro.dspace.refactoring.prices.RegularMoviePrice;

/**
 * 
 * @author mom
 *
 */
public enum MoviePriceCode {
	/** */
	CHILDRENS(new ChildrensMoviePrice()),
	
	/** */
	REGULAR(new RegularMoviePrice()),
	
	/** */
	NEW_RELEASE(new NewReleaseMoviePrice());

	private final MoviePrice moviePrice;

	private MoviePriceCode(MoviePrice moviePrice) {
		this.moviePrice = moviePrice;
	}

	/**
	 * Получить стратегию расчета оплаты.
	 * 
	 * @return
	 */
	public MoviePrice getMoviePrice() {
		return moviePrice;
	}

}
