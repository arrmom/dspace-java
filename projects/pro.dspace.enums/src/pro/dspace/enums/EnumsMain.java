package pro.dspace.enums;

/**
 * Перечисления.
 * 
 * @author mom
 *
 */
public class EnumsMain {

	public static void main(String[] args) {
		System.out.println("---- Перечисления ----");
		Color c = Color.BLUE;
		Color c2 = Color.RED;
		Color c3 = c;
		System.out.println("c = " + c);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("Color.DARK_RED to string = " + Color.DARK_RED);
		print("c", c);
		if (c.equals(Color.WHITE)) {
			System.out.println("белый");
		} else {
			System.out.println("не белый");
		}
		switch (c2) {
		case BLACK:
			System.out.println("c это черный");
			break;
		case BLUE:
			System.out.println("c это синий");
			break;
		case DARK_RED:
			System.out.println("c это темно-красный");
			break;
		case GREEN:
			System.out.println("c это зеленый");
			break;
		case RED:
			System.out.println("c это красный");
			break;
		case WHITE:
			System.out.println("c это белый");
			break;
		}
		// valueOf
		Color c4 = Color.valueOf("DARK_RED");
		System.out.println("c4 = " + c4);
		try {
			Color.valueOf("MY COLOR");
		} catch (IllegalArgumentException e) {
			System.out.println("Нет цвета, error = " + e.getMessage());
		}
		// values
		System.out.println("Все значения перечисления Color:");
		for (Color col : Color.values()) {
			System.out.println(col + ", RGB value = #" + Integer.toHexString(col.getValue()));
		}
		
		Color c5 = Color.valueOf(0x0);
		System.out.println("c5 = " + c5);
	}

	private static void print(String comment, Color color) {
		System.out.println(comment + ": " + color);
	}

}
