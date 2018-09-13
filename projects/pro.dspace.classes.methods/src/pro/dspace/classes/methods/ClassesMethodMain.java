package pro.dspace.classes.methods;

import java.util.Date;

import pro.dspace.classes.methods.User.Address;
import pro.dspace.classes.methods.User.Inner;

/**
 * Классы и методы.
 * 
 * @author mom
 *
 */
public class ClassesMethodMain {

	public static void main(String[] args) {
		System.out.println("Классы и методы");
		System.out.println("-- перегрузка методов --");
		User user = new User();
		user.send();
		user.send("Сообщение");
		user.send(123);
		System.out.println("-- перегрузка конструкторов --");
		User user2 = new User("John");
		System.out.println("user2.getName() = " + user2.getName());
		User user3 = new User("Bill", 34);
		System.out.println("user3.getName() = " + user3.getName() + ", user3.getAge() = " + user3.getAge());

		System.out.println("-- параметры-объекты --");
		user.send(new Message("Hello", new Date()));
		System.out.println("user.getNicknames() = " + user.getNicknames());

		System.out.println("-- доступ --");
		user.method2();

		System.out.println("-- статические поля и методы --");
		System.out.println("User.DEFAULT_MESSAGE = " + User.DEFAULT_MESSAGE);
		for(int i = 0; i < 10; ++i) {
			new User();
		}
		User.printNumObjects();
		
		System.out.println("-- вложенные и внутренние классы --");
		User.Address adr = user.getAddress();
		System.out.println("adr.town = " + adr.town);
		@SuppressWarnings("unused")
		Address adr2 = new User.Address();
		Inner inner = new User().new Inner();
	}

}
