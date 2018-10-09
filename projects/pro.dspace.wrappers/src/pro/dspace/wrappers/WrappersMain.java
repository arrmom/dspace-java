package pro.dspace.wrappers;

import java.util.List;

/**
 * Оболочки примитивных типов и автоупаковка.
 * 
 * @author mom
 *
 */
public class WrappersMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Character c = 'П';
		List<Character> list;
		Boolean bool = true;
		Byte bt = 10;
		Short s = 20;
		Integer i = 340;
		Long l = 12312323123L;
		Float f = 10.23f;
		Double d = 23.232;
		//
		Integer x = Integer.valueOf(128);
		Integer y = Integer.valueOf(128);
		if (x == y) {
			System.out.println("x == y");
		} else {
			System.out.println("x != y");
		}
	}

}
