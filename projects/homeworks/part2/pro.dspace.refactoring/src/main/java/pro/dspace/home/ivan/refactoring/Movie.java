package pro.dspace.home.ivan.refactoring;

/**
 * Данные о фильме.
 * 
 * @author mom
 *
 */
public interface Movie {
	
	/**
	 * Возвращает прайс-код фильма.
	 * @return прайс-код
	 */
	public int getPriceCode();

	/**
	 * Возвращает количество заработанных очков
	 * @param daysRented количество дней использования
	 * @return количество заработанных очков
	 */
	public int getAddPoints(int daysRented);

	/**
	 * Возвращает название фильма
	 * @return название фильма
	 */
	public String getTitle();
	
	/**
	 * Возвращает стоимость аренды фильма
	 * @param daysRented количество дней аренды
	 * @return стоимость аренды
	 */
	public double rentalAmount(int daysRented);
}
