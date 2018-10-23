package pro.dspace.home.ivan.refactoring;

public class MovieChildrens implements Movie {

	private final String title;

	public final int PRICE_CODE = 2;

	private final int ADD_POINTS = 1;

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
	public int getAddPoints(int daysRented) {
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
