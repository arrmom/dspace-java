package pro.dspace.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class StringBuilderTest {

	@Test
	public void testContruct() {
		StringBuilder sb = new StringBuilder();
		assertEquals(0, sb.length());
		assertEquals("", sb.toString());
		assertEquals(16, sb.capacity());
	}

	@Test
	public void testContructCapacity() {
		StringBuilder sb = new StringBuilder(1024);
		assertEquals(0, sb.length());
		assertEquals(1024, sb.capacity());
	}

	@Test
	public void testAppend() {
		StringBuilder sb = new StringBuilder();
		String ss = "";
		sb.append("str1 ");
		ss += "str1 "; // ss = ss + "str1 ";
		sb.append(10);
		ss += 10;
		sb.append(',');
		ss += ',';
		Object obj = new Object() {
			@Override
			public String toString() {
				return "myObj";
			}
		};
		sb.append(obj);
		ss += obj;
		char[] carr = new char[] { 'a', 'b', 'c' };
		sb.append(carr);
		ss += carr[0];
		ss += carr[1];
		ss += carr[2];
		String s = sb.toString();
		assertEquals("str1 10,myObjabc", s);
		assertEquals(ss, s);
	}

	@Test
	public void testInsert() {
		StringBuilder sb = new StringBuilder("Hello, World!");
		sb.insert(0, "1. ");
		assertEquals("1. Hello, World!", sb.toString());
	}
	
}
