package pro.dspace.home.ivan.refactoring;

/**
 * Информация о фильмах жанра NewRelease
 * 
 * @author Filin.PW
 *
 */
public class MovieNewRelease implements Movie {

	/**
	 * Название фильма
	 */
	private final String title;

	/**
	 * Прайс-код
	 */
	public final int PRICE_CODE = 1;

	/**
	 * Начальное количество начисляемых очков
	 */
	private final int ADD_POINTS = 1;

	/**
	 * Конструктор
	 * 
	 * @param title название фильма
	 */
	public MovieNewRelease(String title) {
		this.title = title;
	}

	@Override
	public int getPriceCode() {
		return PRICE_CODE;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public int points(int daysRented) {
		int result = ADD_POINTS;

		if (daysRented > 1) {
			result++;
		}

		return result;
	}

	@Override
	public double rentalAmount(int daysRented) {
		return daysRented * 3;
	}

}
