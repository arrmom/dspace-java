package pro.dspace.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/**
 * 
 * @author mom
 *
 */
public class HashMapTest {

	@Test
	public void testConstruct() {
		Map<Long, Double> map = new HashMap<>();
		assertTrue(map.isEmpty());
		assertEquals(0, map.size());
	}

	@Test
	public void testPutGet() {
		Map<Long, String> map = new HashMap<>();
		map.put(3L, "Hello");
		map.put(8L, "Str3");
		map.put(823423445L, "Str4");
		map.put(823423446L, "World");
		assertNull(map.get(10L));
		assertEquals("Hello", map.get(3L));
		assertEquals("World", map.get(823423446L));
		assertEquals(4, map.size());
	}

	@Test
	public void testEntrySet() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "s1");
		map.put(6, "s6");
		map.put(10, "s10");
		// плохой способ
		System.out.println("Iteration 1");
		for(int key: map.keySet()) {
			String val = map.get(key);
			System.out.println("" + key + " : " + val);
		}
		// хороший способ
		System.out.println("Iteration 2");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println("" + entry.getKey() + " : " + entry.getValue());
			assertEquals(entry.getValue(), map.get(entry.getKey()));
		}
	}
	
}
