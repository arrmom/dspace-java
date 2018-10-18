package pro.dspace.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

	@Test
	public void testBuildReport() {
		Customer customer = new Customer("Трофим Иванов");
		Movie m1 = new Movie("Фильм1", Movie.NEW_RELEASE);
		Movie m2 = new Movie("Фильм2", Movie.CHILDRENS);
		Movie m3 = new Movie("Фильм3", Movie.REGULAR);
		customer.addRental(new Rental(m1, 3));
		customer.addRental(new Rental(m2, 5));
		customer.addRental(new Rental(m3, 1));
		String report = customer.buildReport();
		assertNotNull(report);
		System.out.println("report = " + report);
		assertEquals("Учет аренды для Трофим Иванов\n" + 
				"	Фильм1	17.0\n" + 
				"	Фильм2	47.0\n" + 
				"	Фильм3	2.0\n" + 
				"Сумма задолженности составляет 66.0\n" + 
				"Вы заработали 3 очков за активность", report);
	}

}
