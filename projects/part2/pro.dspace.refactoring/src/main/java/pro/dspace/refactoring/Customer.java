package pro.dspace.refactoring;

/**
 * Клиент магазина.
 * 
 * @author mom
 *
 */
public class Customer {

	private final String name;

	private Rental[] rentals;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String buildReport() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Учет аренды для" + getName() + "\n";
		for (Rental each : rentals) {
			double thisAmount = 0;
			// определить сумму для каждой строки
			switch (each.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (each.getDaysRented() > 2) {
					thisAmount += (each.getDaysRented() - 2) * 15;
				}
				break;
			case Movie.NEW_RELEASE:
				thisAmount += each.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 15;
				if (each.getDaysRented() > 3) {
					thisAmount += (each.getDaysRented() - 3) * 15;
				}
				break;
			}
			// добавить очки для активного арендатора
			frequentRenterPoints++;
			// бонус за аренду новинки на два дня
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
				frequentRenterPoints++;
			}
			// показать результаты для этой аренды
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		// добавить нижний колонтитул
		result += "Сумма задолженности составляет" + String.valueOf(totalAmount) + "\n";
		result += "Вы заработали " + String.valueOf(frequentRenterPoints) + "очков за активность";
		return result;
	}

}
