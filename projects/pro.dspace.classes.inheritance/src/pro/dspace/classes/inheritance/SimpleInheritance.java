package pro.dspace.classes.inheritance;

/**
 * 
 * @author mom
 *
 */
public class SimpleInheritance {
	
	public void execute() {
		System.out.println("-- simple inheritance --");
		A a = new A();
		a.i = 2;
		System.out.println("a: ");
		a.printI();
		B b = new B();
		b.i = 3;
		b.j = -1;
		b.k = 8;
		System.out.println("b: ");
		b.printI();
		b.printIJ();
		b.printK();
	}

}
