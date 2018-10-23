package pro.dspace.home.ivan.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;

import org.junit.Before;
import org.junit.Test;

import pro.dspace.home.ivan.bag.Bag;
import pro.dspace.home.ivan.bag.IvanBag;

/**
 * 
 * @author Filin.PW
 *
 */
public class IvanBagTest {

	/** Объект тестируемогго класса */
	private Bag<Object> bag;

	@Before
	public void setUp() {
		bag = new IvanBag();
	}

	@Test
	public void testIsEmpty() {
		Double obj0 = 0.;
		
		assertTrue(bag.isEmpty());
		bag.add(obj0);
		assumeFalse(bag.isEmpty());
		bag.remove(obj0);
		assertTrue(bag.isEmpty());
	}
	
	@Test
	public void testSize() {
		Integer obj0 = 0;
		Integer obj10 = 10;
		
		assertEquals(0, bag.size());
		bag.add(obj0);
		assertEquals(1, bag.size());
		bag.add(obj0);
		assertEquals(2, bag.size());
		bag.add(obj10);
		assertEquals(3, bag.size());
		bag.remove(obj10);
		assertEquals(2, bag.size());
	}
	
	@Test
	public void testCount() {
		Character obj0 = '0';
		Integer obj10 = 10;
		String obj20 = "20";

		assumeFalse(bag.contains(obj0));
		assertEquals(0, bag.count(obj10));
		bag.add(obj10);
		assertTrue(bag.contains(obj10));
		assertEquals(1, bag.count(obj10));
		bag.add(obj20);
		bag.add(obj20);
		assertEquals(2, bag.count(obj20));
	}
	
	@Test
	public void testContains() {
		Character obj0 = '0';
		Float obj10 = (float) 10.;
		
		assumeFalse(bag.contains(obj0));
		bag.add(obj0);
		assertTrue(bag.contains(obj0));
		assumeFalse(bag.contains(obj10));
		bag.add(obj10);
		assertTrue(bag.contains(obj10));
		bag.remove(obj0);
		assumeFalse(bag.contains(obj0));
	}	
	
	@Test
	public void testRemove() {
		Character obj0 = '0';
		Double obj10 = 10.;
		
		assumeFalse(bag.contains(obj0));
		bag.add(obj0);
		bag.add(obj10);
		assertTrue(bag.remove(obj0));
		assertEquals(0, bag.count(obj0));
		assumeFalse(bag.remove(obj0));
		assertTrue(bag.remove(obj10));		
	}

	@Test
	public void testAdd() {
		Character obj0 = '0';
		Integer obj10 = 10;
		String obj20 = "20";
		
		assumeFalse(bag.contains(obj0));
		assertEquals(0, bag.count(obj10));
		bag.add(obj10);
		assertTrue(bag.contains(obj10));
		assertEquals(1, bag.count(obj10));
		bag.add(obj20);
		bag.add(obj20);
		assertEquals(2, bag.count(obj20));
	}

}
