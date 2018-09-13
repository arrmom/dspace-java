package pro.dspace.classes.methods;

import java.util.LinkedList;
import java.util.List;

/**
 * Пользователь.
 * 
 * @author mom
 *
 */
public class User {

	public final static String DEFAULT_MESSAGE = "How you do!";

	private static int numObjects = 0;

	private String name;

	private int age;

	private final Address address = new Address();

	/**
	 * Конструктор по умолчанию.
	 */
	public User() {
		++numObjects;
		System.out.println("User()");
		method();
	}

	public User(String name) {
		super();
		++numObjects;
		this.name = name;
		System.out.println("User(String name)");
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("User(String name, int age)");
		++numObjects;
	}

	/**
	 * 
	 */
	public static void printNumObjects() {
		System.out.println("numObjects = " + numObjects);
	}

	public void send() {
		System.out.println("send()");
	}

	public void send(String mess) {
		System.out.println("send(), mess = " + mess);
	}

	public void send(int value) {
		System.out.println("send(), value = " + value);
	}

	public void send(Message mess) {
		System.out.println("send(), mess = " + mess);
	}

	/**
	 * 
	 * @return
	 */
	public List<String> getNicknames() {
		return new LinkedList<>();
	}

	/**
	 * Уровень доступа класса.
	 */
	private void method() {
		System.out.println("method()");
	}

	/**
	 * Уровень доступа пакета.
	 */
	void method2() {
		System.out.println("method2()");
	}

	/**
	 * Уровень доступа подкласса.
	 */
	protected void method3() {
		System.out.println("method3()");
	}

	public final void method4() {
		System.out.println("method4()");
	}

	/**
	 * Вложенный класс.
	 */
	public static class Address {
		String town = "Barnaul";
		String street;
		// ..
	}

	/**
	 * Внутренний.
	 * 
	 * @author mom
	 *
	 */
	public class Inner {
		private float val;
	}

	// *** Getters/Setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

}
