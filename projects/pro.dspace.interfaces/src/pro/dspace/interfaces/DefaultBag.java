package pro.dspace.interfaces;

public class DefaultBag implements Bag {
	
	private int capacity;

	@Override
	public void add(int val) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int val) {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(int val) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int count(int val) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
