package pro.dspace.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
//@RunWith(BlockJUnit4ClassRunner.class)
public class DefaultBagTest {

	private DefaultBag<String> bag;
	
	@Before
	public void setUp() {
		bag = new DefaultBag<>();
	}

	@After
	public void tearDown() {
		bag = null;
	}

	@Test
	public void testSize() {
		assertEquals(0, bag.size());
		bag.add("Text");
		assertEquals(1, bag.size());
		bag.add("Text1");
		assertEquals(2, bag.size());
		bag.remove("Text1");
		assertEquals(1, bag.size());
	}

	@Test
	public void testIsEmpty() {
		assertTrue(bag.isEmpty());
		bag.add("test");
		assertFalse(bag.isEmpty());
		bag.remove("test");
		assertTrue(bag.isEmpty());
	}
	
	@Test
	public void testAdd() {
		String str1 = "str1";
		bag.add(str1);
		assertTrue(bag.contains(str1));
		String str2 = "str2";
		bag.add(str2);
		assertTrue(bag.contains(str2));
		// count
		bag.add(str1);
		assertEquals(2, bag.count(str1));
		bag.add(str2);
		assertEquals(2, bag.count(str2));
	}
	
	@Test
	public void testRemove() {
		String str1 = "str1";
		bag.add(str1);
		assertTrue(bag.contains(str1));
		bag.remove(str1);
		assertFalse(bag.contains(str1));
		bag.add(str1);
		bag.add(str1);
		assertEquals(2, bag.count(str1));
		bag.remove(str1);
		assertEquals(1, bag.count(str1));
		bag.remove(str1);
		assertEquals(0, bag.count(str1));
	}

	@Test
	@Ignore("Временно не реализуем")
	public void testThreadSafe() {
		fail("not imp");
	}
	
}
