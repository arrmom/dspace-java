package pro.dspace.refactoring;

/**
 * Данные о фильме.
 * 
 * @author mom
 *
 */
public class Movie {

	public static final int CHILDRENS = 2;

	public static final int REGULAR = 0;

	public static final int NEW_RELEASE = 1;

	private final String title;

	private int priceCode;

	public Movie(String title, int priceCode) {
		super();
		this.title = title;
	}

	// ************ Getters/Setters ***********
	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

}
