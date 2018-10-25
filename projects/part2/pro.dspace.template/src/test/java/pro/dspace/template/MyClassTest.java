package pro.dspace.template;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class MyClassTest {

	@Test
	public void test() {
		MyClass obj = new MyClass();
		assertNotNull(obj.toString());
	}

}
