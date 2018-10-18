package pro.dspace.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

	@Test
	public void testBuildReport() {
		Customer customer = new Customer("Трофим Иванов");
		Movie m1 = new Movie("Movie1", Movie.NEW_RELEASE);
		Movie m2 = new Movie("Movie2", Movie.CHILDRENS);
		Movie m3 = new Movie("Movie3", Movie.REGULAR);
		customer.addRental(new Rental(m1, 3));
		customer.addRental(new Rental(m2, 5));
		customer.addRental(new Rental(m3, 1));
		String report = customer.buildReport();
		assertNotNull(report);
		assertEquals("Учет аренды для Трофим Иванов\n" + 
				"	Movie1	17.0\n" + 
				"	Movie2	47.0\n" + 
				"	Movie3	2.0\n" + 
				"Сумма задолженности составляет 66.0\n" + 
				"Вы заработали 3 очков за активность", report);
	}

}
