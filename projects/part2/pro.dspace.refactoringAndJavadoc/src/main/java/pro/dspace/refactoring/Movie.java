package pro.dspace.refactoring;

/**
 * Данные о фильме. Используется в классе {@link Rental} в методе {@link Rental#getCharge()}.
 * 
 * @author mom
 * @see MoviePriceCode
 */
public class Movie {

	private final String title;

	private MoviePriceCode priceCode;

	/**
	 * Создать объект фильма.
	 * 
	 * @param title     название фильма, не {@code null}
	 * @param priceCode код стоимости, не {@code null}
	 * 
	 * @exception IllegalArgumentException генерируется при неверных параметрах
	 */
	public Movie(String title, MoviePriceCode priceCode) throws IllegalArgumentException {
		super();
		assertTrue(title != null, "title must not be null");
		assertTrue(priceCode != null, "priceCode must not be null");
		this.title = title;
		this.priceCode = priceCode;
	}

	/**
	 * Проверить условие.
	 * 
	 * @param condition
	 * @param msg
	 */
	private void assertTrue(boolean condition, String msg) {
		if (!condition) {
			throw new IllegalArgumentException(msg);
		}
	}

	// ************ Getters/Setters ***********
	public MoviePriceCode getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(MoviePriceCode priceCode) {
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

}
