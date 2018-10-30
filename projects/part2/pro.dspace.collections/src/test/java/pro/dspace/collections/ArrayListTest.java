package pro.dspace.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.lang.StringBuilder;

import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class ArrayListTest {

	@Test
	public void testConstruct() {
		List<String> list = new ArrayList<>();
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
	}

	@Test
	public void testConstructCapacity() {
		ArrayList<String> list = new ArrayList<>(100);
		assertTrue(list.isEmpty());
		assertEquals(0, list.size());
	}

	@Test
	public void testAdd() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("123");
		list.add("A");
		assertEquals(4, list.size());
		assertFalse(list.isEmpty());
	}
	
	@Test
	public void testConstructCopy() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("123");
		list.add("A");
		List<String> list2 = new ArrayList<>(list);
		assertEquals(list, list2);
		assertTrue(list.equals(list2));
		assertNotSame(list2, list);
	}

	@Test
	public void testIterate() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		// for-each
		StringBuilder sb = new StringBuilder();
		for(String s: list) {
			if (sb.length() > 0) {
				sb.append(',');
			}
			sb.append(s);
		}
		assertEquals("A,B,A", sb.toString());
		// iterator
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			if (s.equals("A")) {
				iter.remove();
			}
		}
		assertEquals(Arrays.asList("B"), list);
	}
	
}
