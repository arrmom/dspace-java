package pro.dspace.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

	@Test
	public void testBuildReport() {
		Customer customer = new Customer("Трофим Иванов");
		String report = customer.buildReport();
		assertNotNull(report);
		// TODO:
		fail("not impl");
	}

}
