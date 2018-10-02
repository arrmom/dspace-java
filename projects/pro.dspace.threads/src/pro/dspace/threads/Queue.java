package pro.dspace.threads;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author mom
 *
 */
public class Queue {
	
	private final List<Integer> list = new LinkedList<>();
	
	public void add(int val) {
		list.add(Integer.valueOf(val));
	}

	public int get() {
		if (list.isEmpty()) {
			return -1;
		}
		int val = list.get(0);
		list.remove(0);
		return val;
	}
	
}
