package pro.dspace.refactoring;

/**
 * Данные о прокате фильма.
 * 
 * @author mom
 *
 */
public class Rental {

	private final Movie movie;

	private final int daysRented;

	public Rental(Movie movie, int daysRented) {
		super();
		this.movie = movie;
		this.daysRented = daysRented;
	}

	/**
	 * Получить сумма за прокат.
	 * 
	 * @return сумма в единицах валюты
	 */
	public double amountFor() {
		double result = 0;
		// определить сумму для каждой строки
		switch (getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (getDaysRented() > 2) {
				result += (getDaysRented() - 2) * 15;
			}
			break;
		case Movie.NEW_RELEASE:
			result += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 15;
			if (getDaysRented() > 3) {
				result += (getDaysRented() - 3) * 15;
			}
			break;
		}
		return result;
	}

	// ************ Getters/Setters ***********
	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

}
