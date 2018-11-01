package pro.dspace.regex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class RegexTest {

	@Test
	public void testMatch() {
		Pattern pattern = Pattern.compile("^[0-9]*$");
		assertTrue(pattern.matcher("1234556").matches());
		assertTrue(pattern.matcher("03425456").matches());
		Matcher m = pattern.matcher("a03425456");
		assertFalse(m.matches());
		assertFalse(m.find());
		assertFalse(pattern.matcher("03425456b").matches());
		assertFalse(pattern.matcher("0342x5456").matches());
		Pattern p2 = Pattern.compile("[0-9]*$");
		Matcher m2 = p2.matcher("a03425456");
		assertFalse(m2.matches());
		assertTrue(m2.find());
		assertEquals("03425456", m2.group(0));
	}

	@Test
	public void testMatchGroup() {
		Pattern p = Pattern.compile("([a-zA-Z][a-zA-Z0-9_.]*)@([a-zA-Z][a-zA-Z0-9.]*)");
		assertFalse(p.matcher("1234556").matches());
		assertFalse(p.matcher("@asdasd.ru").matches());
		assertFalse(p.matcher("user@").matches());
		assertFalse(p.matcher("user@1").matches());
		assertTrue(p.matcher("user@domain").matches());
		//
		Matcher m = p.matcher("bill@domain.com");
		assertTrue(m.matches());
		assertEquals("bill@domain.com", m.group(0));
		assertEquals("bill", m.group(1));
		assertEquals("domain.com", m.group(2));
	}

	@Test
	public void testMatchGroupRef() {
		Pattern p = Pattern.compile("(\\w+).*\\1");
		assertTrue(p.matcher("test asdfas342345 test").matches());
		assertFalse(p.matcher("test asdfas342345 test1").matches());
		assertFalse(p.matcher(". asdfas342345 .").matches());
	}
	
	private final Pattern REGEX = Pattern.compile(".*!$");
	
	@Test
	public void testStringMatches() {
		String s = "Hello!";
		assertTrue(s.matches(".*!$"));
		// more effective
		assertTrue(REGEX.matcher(s).matches());
		assertFalse(REGEX.matcher("Hello").matches());
	}

}
