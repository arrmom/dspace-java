package pro.dspace.refactoring;

/**
 * Данные о прокате фильма.
 * 
 * @author mom
 *
 */
public class Rental {

	private static final int DEFAULT_DAYS_RENTED = 7;

	private final Movie movie;

	private final int daysRented;

	/**
	 * Создать данные о прокате для {@value #DEFAULT_DAYS_RENTED} дней.
	 * 
	 * @param movie
	 */
	public Rental(Movie movie) {
		this(movie, DEFAULT_DAYS_RENTED);
	}

	public Rental(Movie movie, int daysRented) {
		super();
		this.movie = movie;
		this.daysRented = daysRented;
	}

	/**
	 * Получить сумму за прокат.
	 * 
	 * @return сумма в единицах валюты
	 */
	public double getCharge() {
		return getMovie().getPriceCode().getMoviePrice().getCharge(this);
	}

	// ************ Getters/Setters ***********
	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

}
