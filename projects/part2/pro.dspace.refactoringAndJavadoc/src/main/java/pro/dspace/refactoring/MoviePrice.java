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
	 * @return
	 */
	double getCharge(Rental rental);

}
