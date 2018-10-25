package pro.dspace.strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.nio.charset.Charset;

import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class StringTest {

	@Test
	public void testContruct() {
		String s = new String();
		assertTrue(s.isEmpty());
		assertEquals(0, s.length());
	}

	@Test
	public void testLiteral() {
		assertEquals(String.class, "some test".getClass());
		assertEquals(5, "12345".length());
	}

	@Test
	public void testContructFromString() {
		// copy constructor
		assertEquals("str", new String("str"));
	}

	@Test
	public void testEquals() {
		String s1 = "text";
		String s2 = new String("text");
		String s3 = "text_";
		assertEquals(s1, s2);
		assertNotSame(s1, s2); // assertTrue(s1 != s2);
		assertNotEquals(s3, s1);
	}

	@Test
	public void testContructFromChars() {
		char[] chars = { 'b', 'y', 'e' };
		assertEquals("bye", new String(chars));
	}

	@Test
	public void testContructFromCharSegment() {
		char[] chars = { '0', '1', '2', '3' };
		assertEquals("12", new String(chars, 1, 2));
	}

	@Test
	public void testContructFromCodepoints() {
		int[] codePoints = { 0x30, 0xffff + 1, 0xffff + 2, 0xffff + 3, 0x30 };
		String s = new String(codePoints, 0, codePoints.length);
		assertEquals("0𐀀𐀁𐀂0", s);
		assertEquals(8, s.length());
		assertTrue(Character.isHighSurrogate(s.charAt(1)));
		assertTrue(Character.isLowSurrogate(s.charAt(2)));
		assertFalse(Character.isHighSurrogate(s.charAt(0)));
		assertFalse(Character.isLowSurrogate(s.charAt(0)));
		assertFalse(Character.isHighSurrogate(s.charAt(7)));
		assertFalse(Character.isLowSurrogate(s.charAt(7)));
	}

	@Test
	public void testContructFromBytesDefaultCharset() {
		byte[] bytes = { 0x45, 0x50, 0x7a, 0x31 };
		String s = new String(bytes);
		assertEquals("EPz1", s);
	}
	
	@Test
	public void testContructFromBytes() {
		byte[] bytes = { 0x45, 0x50, 0x7a, 0x31, (byte) 0xd0, (byte) 0x99 };
		String s = new String(bytes, Charset.forName("UTF-8"));
		assertEquals("EPz1Й", s);
		assertEquals(5, s.length());
		assertEquals(1049, (int)'Й');
		assertEquals(1055, (int)'П');
	}

	@Test
	public void testCharAt() {
		assertEquals('x', "wxY".charAt(1));
	}
	
	@Test
	public void testIndexOfLastIndexOf() {
		assertEquals(2, "Hello".indexOf('l'));
		assertEquals(3, "Hello".lastIndexOf('l'));
	}	

	@Test
	public void testConcat() {
		assertEquals("str1str2", "str1".concat("str2")); 
		assertEquals("str1" + "str2", "str1".concat("str2"));
	}
	
	@Test
	public void testTrim() {
		assertEquals("Test", "   	Test  ".trim());
	}

	@Test
	public void testSplit() {
		String[] list = "1 a asd 23".split(" ");
		assertEquals("1", list[0]);
		assertEquals("a", list[1]);
		assertEquals("asd", list[2]);
		assertEquals("23", list[3]);
	}

	@Test
	public void testToLowerCase() {
		assertEquals("abcd", "AbCd".toLowerCase());
	}
	
}
