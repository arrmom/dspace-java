package pro.dspace.home.ivan.refactoring;

/**
 * Информация о фильмах жанра Childrens
 * 
 * @author Filin.PW
 *
 */
public class MovieChildrens implements Movie {

	/**
	 * Название фильма
	 */
	private final String title;

	/**
	 * Прайс-код
	 */
	public final int PRICE_CODE = 2;

	/**
	 * Начальное количество начисляемых очков
	 */
	private final int ADD_POINTS = 1;

	/**
	 * Конструктор
	 * 
	 * @param title название фильма
	 */
	public MovieChildrens(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
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
	public double rentalAmount(int daysRented) {
		double result = 15;
		if (daysRented > 3) {
			result += (daysRented - 3) * 15;
		}

		return result;
	}

}
