package pro.dspace.generics;

/**
 * Пара.
 * 
 * @author mom
 *
 * @param <U>
 * @param <V>
 */
public class Pair<U, V> {

	private final U first;

	private final V second;

	private final int hash;

	public Pair(U first, V second) {
		this.first = first;
		this.second = second;
		hash = (first != null ? first.hashCode() : 0) * 31 + (second != null ? second.hashCode() : 0);
	}

	/**
	 * 
	 * @return
	 */
	public U getFirst() {
		return first;
	}

	/**
	 * 
	 * @return
	 */
	public V getSecond() {
		return second;
	}

	@Override
	public int hashCode() {
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "(" + first + ", " + second + ")";
	}

}
