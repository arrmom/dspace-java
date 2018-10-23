package pro.dspace.refactoring;

/**
 * 
 * @author mom
 *
 */
public interface MoviePrice {

	/**
	 * Вычислить стоимость проката.
	 * 
	 * @param rental
	 * @return стоимость в единицах валюты (в долларах, например)
	 */
	double getCharge(Rental rental);

}
