package pro.dspace.classes.inheritance;

/**
 * Подкласс класса A.
 * 
 * @author mom
 *
 */
public class B extends A {

	int k;

	void printIJ() {
		System.out.println("i = " + i + ", j = " + j);
	}

	void printK() {
		System.out.println("k = " + k);
	}

}
