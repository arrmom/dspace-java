package pro.dspace.home.ivan.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;

import org.junit.Before;
import org.junit.Test;

import pro.dspace.home.ivan.bag.Bag;
import pro.dspace.home.ivan.bag.MyBag;

/**
 * 
 * @author Ivan Nosov
 *
 */
public class MyBagTest {

	/** Объект тестируемогго класса */
	private Bag<Integer> bag;

	@Before
	public void setUp() {
		bag = new MyBag();
	}

	@Test
	public void testIsEmpty() {
		assertTrue(bag.isEmpty());
		bag.add(0);
		assumeFalse(bag.isEmpty());
		bag.remove(0);
		assertTrue(bag.isEmpty());
	}

	@Test
	public void testSize() {
		assertEquals(0, bag.size());
		bag.add(0);
		assertEquals(1, bag.size());
		bag.add(0);
		assertEquals(2, bag.size());
		bag.add(10);
		assertEquals(3, bag.size());
		bag.remove(10);
		assertEquals(2, bag.size());
	}

	@Test
	public void testCount() {
		assumeFalse(bag.contains(0));
		assertEquals(0, bag.count(10));
		bag.add(10);
		assertTrue(bag.contains(10));
		assertEquals(1, bag.count(10));
		bag.add(20);
		bag.add(20);
		assertEquals(2, bag.count(20));
	}

	@Test
	public void testContains() {
		assumeFalse(bag.contains(0));
		bag.add(0);
		assertTrue(bag.contains(0));
		assumeFalse(bag.contains(10));
		bag.add(10);
		assertTrue(bag.contains(10));
		bag.remove(0);
		assumeFalse(bag.contains(0));
	}

	@Test
	public void testRemove() {
		assumeFalse(bag.contains(0));
		bag.add(0);
		bag.add(10);
		assertTrue(bag.remove(0));
		assertEquals(0, bag.count(0));
		assumeFalse(bag.remove(0));
		assertTrue(bag.remove(10));
	}

	@Test
	public void testAdd() {
		assumeFalse(bag.contains(0));
		assertEquals(0, bag.count(10));
		bag.add(10);
		assertTrue(bag.contains(10));
		assertEquals(1, bag.count(10));
		bag.add(20);
		bag.add(20);
		assertEquals(2, bag.count(20));
	}

}
