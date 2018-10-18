package pro.dspace.refactoring;

import java.util.Arrays;

/**
 * Клиент магазина.
 * 
 * @author mom
 *
 */
public class Customer {

	private final String name;

	private Rental[] rentals = new Rental[10];

	private int numRentals;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/**
	 * Добавить данные о прокате.
	 */
	public void addRental(Rental rental) {
		if (numRentals >= rentals.length) {
			rentals = Arrays.copyOf(rentals, rentals.length + 10);
		}
		rentals[numRentals++] = rental;
	}

	/**
	 * Построить отчет об оплате за аренду фильмов.
	 * 
	 * @return
	 */
	public String buildReport() {
		String result = "Учет аренды для " + getName() + "\n";
		for (int i = 0; i < numRentals; ++i) {
			Rental each = rentals[i];
			// показать результаты для этой аренды
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.amountFor()) + "\n";
		}
		// добавить нижний колонтитул
		result += "Сумма задолженности составляет " + String.valueOf(calcTotalRentalAmount()) + "\n";
		result += "Вы заработали " + String.valueOf(calcFrequentRenterPoints()) + " очков за активность";
		return result;
	}

	private int calcFrequentRenterPoints() {
		int frequentRenterPoints = 0;
		for (int i = 0; i < numRentals; ++i) {
			Rental each = rentals[i];
			// добавить очки для активного арендатора
			frequentRenterPoints++;
			// бонус за аренду новинки на два дня
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
				frequentRenterPoints++;
			}
		}
		return frequentRenterPoints;
	}

	private double calcTotalRentalAmount() {
		double totalAmount = 0;
		for (int i = 0; i < numRentals; ++i) {
			totalAmount += rentals[i].amountFor();
		}
		return totalAmount;
	}

	/**
	 * Построить отчет в HTML формате.
	 * 
	 * @return
	 */
	public String buildReportHTML() {
		// TODO
		return null;
	}

}
