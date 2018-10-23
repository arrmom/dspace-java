package pro.dspace.home.ivan.refactoring;

public class MovieRegular implements Movie {

	private final String title;

	public final int PRICE_CODE = 0;

	private final int ADD_POINTS = 1;

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
