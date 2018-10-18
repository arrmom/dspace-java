package pro.dspace.refactoring;

/**
 * Данные о фильме.
 * 
 * @author mom
 *
 */
public class Movie {

	private final String title;

	private MoviePriceCode priceCode;

	public Movie(String title, MoviePriceCode priceCode) {
		super();
		this.title = title;
		this.priceCode = priceCode;
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
