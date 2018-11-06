package pro.dspace.network;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import pro.dspace.network.MyClass;

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
