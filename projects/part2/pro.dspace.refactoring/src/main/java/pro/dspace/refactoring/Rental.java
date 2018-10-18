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

	// ************ Getters/Setters ***********
	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

}
