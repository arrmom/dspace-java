package pro.dspace.home.ivan.refactoring;

/**
 * Информация о фильмах жанра Regular
 * 
 * @author Filin.PW
 *
 */
public class MovieRegular implements Movie {

	/**
	 * Название фильма
	 */
	private final String title;

	/**
	 * Прайс-код
	 */
	public final int PRICE_CODE = 0;

	/**
	 * Начальное количество начисляемых очков
	 */
	private final int ADD_POINTS = 1;

	/**
	 * Конструктор
	 * @param title название фильма
	 */
	public MovieRegular(String title) {
		this.title = title;
	}

	@Override
	public int getPriceCode() {
		return PRICE_CODE;
	}

	@Override
	public int points(int daysRented) {
		return ADD_POINTS;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public double rentalAmount(int daysRented) {
		double result = 2;
		if (daysRented > 2) {
			result += (daysRented - 2) * 15;
		}
		return result;
	}

}
