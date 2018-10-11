package pro.dspace.generics;

import java.lang.reflect.InvocationTargetException;

/**
 * 
 * @author mom
 *
 */
public class Gen<T> {

	private final T obj;

	private T obj2;
	
	private T[] array;

	public Gen(T obj) {
		this.obj = obj;
		// obj2 = new T(); нельзя !!
		// array = new T[100]; нельзя !!
		// T.class.getName() нельзя !!
	}

	/**
	 * 
	 * @return
	 */
	public T getObj() {
		return obj;
	}

	public void showType() {
		System.out.println("Работаем с типом " + obj.getClass());
	}

}
