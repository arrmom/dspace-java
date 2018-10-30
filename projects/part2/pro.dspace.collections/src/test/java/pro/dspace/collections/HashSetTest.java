package pro.dspace.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class HashSetTest {

	@Test
	public void testConstruct() {
		Set<Integer> set = new HashSet<>();
		assertTrue(set.isEmpty());
	}

	@Test
	public void testAdd() {
		Set<Integer> set = new HashSet<>();
		assertTrue(set.add(1));
		set.add(3);
		set.add(5);
		assertFalse(set.add(3));
		assertEquals(3, set.size());
	}

	@Test
	public void testIterate() {
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(7);
		set.add(1);
		set.add(10);
		for(int v: set) {
			assertTrue(v > 0);
		}
		//
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer v = iter.next();
			if (v >= 5) {
				iter.remove();
			}
		}
		assertFalse(set.contains(7));
		assertFalse(set.contains(10));
		assertTrue(set.contains(1));
	}
	
}
