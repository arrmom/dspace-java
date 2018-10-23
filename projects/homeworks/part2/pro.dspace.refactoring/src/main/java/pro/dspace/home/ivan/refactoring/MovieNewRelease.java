package pro.dspace.home.ivan.refactoring;

public class MovieNewRelease implements Movie {

	private final String title;

	public final int PRICE_CODE = 1;

	private final int ADD_POINTS = 1;

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
