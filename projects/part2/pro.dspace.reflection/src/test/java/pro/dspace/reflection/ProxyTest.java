package pro.dspace.reflection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.Closeable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class ProxyTest {

	private String printResult;

	@Test
	public void testNewProxyInstance() {

		Object obj = Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),
				new Class[] { MyInterface.class, Closeable.class }, new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						if (method.getName().equals("printMessage")) {
							printResult = (String) args[0];
						} else if (method.getName().equals("calcSum")) {
							return (int) args[0] + (int) args[1];
						} else {
							// TODO
						}
						return null;
					}
				});

		assertTrue(obj instanceof MyInterface);
		assertTrue(obj instanceof Closeable);

		MyInterface myObj = (MyInterface) obj;
		myObj.printMessage("Hello, World!");

		assertEquals("Hello, World!", printResult);
		assertEquals(5, myObj.calcSum(2, 3));
	}

}
