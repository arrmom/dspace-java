package pro.dspace.home.ivan.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

	@Test
	public void testBuildReport() {
		Customer customer = createFixture();
		String report = customer.buildReport();
		assertNotNull(report);
		System.out.println("report = " + report);
		assertEquals("Учет аренды для Трофим Иванов\n" + "	Фильм1	9.0\n" + "	Фильм2	45.0\n" + "	Фильм3	2.0\n"
				+ "Сумма задолженности составляет 56.0\n" + "Вы заработали 4 очков за активность", report);
	}

	private Customer createFixture() {
		Customer customer = new Customer("Трофим Иванов");
		Movie m1 = new MovieNewRelease("Фильм1");
		Movie m2 = new MovieChildrens("Фильм2");
		Movie m3 = new MovieRegular("Фильм3");
		customer.addRental(new Rental(m1, 3));
		customer.addRental(new Rental(m2, 5));
		customer.addRental(new Rental(m3, 1));
		return customer;
	}

}
