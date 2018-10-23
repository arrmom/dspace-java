package pro.dspace.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

	@Test
	public void testBuildReport() {
		Customer customer = createFixture();
		String report = customer.buildReport();
		assertNotNull(report);
		System.out.println("report = " + report);
		assertEquals("Учет аренды для Трофим Иванов\n" + 
				"	Фильм1	9.0\n" + 
				"	Фильм2	45.0\n" + 
				"	Фильм3	2.0\n" + 
				"Сумма задолженности составляет 56.0\n" + 
				"Вы заработали 4 очков за активность", report);
	}

	private Customer createFixture() {
		Customer customer = new Customer("Трофим Иванов");
		Movie m1 = new Movie("Фильм1", MoviePriceCode.NEW_RELEASE);
		Movie m2 = new Movie("Фильм2", MoviePriceCode.CHILDRENS);
		Movie m3 = new Movie("Фильм3", MoviePriceCode.REGULAR);
		customer.addRental(new Rental(m1, 3));
		customer.addRental(new Rental(m2, 5));
		customer.addRental(new Rental(m3, 1));
		return customer;
	}

	@Test
	public void testBuildReportHTML() {
		Customer customer = createFixture();
		String report = customer.buildReportHTML();
		assertNotNull(report);
		assertEquals("<title>Учет аренды для Трофим Иванов</title>" + 
				"<item><movie>Фильм1</movie><charge>17.0</charge></item>" + 
				"	Фильм2	47.0\n" + 
				"	Фильм3	2.0\n" + 
				"Сумма задолженности составляет 66.0\n" + 
				"Вы заработали 3 очков за активность", report);
		// TODO: доделать тест
	}
	
}
