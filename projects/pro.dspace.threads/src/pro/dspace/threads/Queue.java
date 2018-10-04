package pro.dspace.threads;

/**
 * 
 * @author mom
 *
 */
public class Queue {

	private volatile int value;

	private volatile boolean valueSet;

	/**
	 * Установить значение. Ожидает получения предыдущего значения.
	 * 
	 * @param val
	 * @throws InterruptedException
	 */
	public void put(int val) throws InterruptedException {
		while (valueSet) {
			synchronized (this) {
				wait(5000);
			}
		}
		synchronized (this) {
			value = val;
			valueSet = true;
			notify();
		}
	}

	/**
	 * Получить значение. Ожидает установку значения.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException {
		while (!valueSet) {
			synchronized (this) {
				wait(5000);
			}
		}
		int val;
		synchronized (this) {
			valueSet = false;
			val = value;
			notify();
		}
		return val;
	}

}
