package pro.dspace.enums;

/**
 * Цвет.
 * 
 * @author mom
 *
 */
public enum Color {

	/** белый */
	WHITE(0xffffff),

	/** черный */
	BLACK(0x0),

	/** красный */
	RED(0xff0000),

	/** зеленый */
	GREEN(0x00ff00),

	/** синий */
	BLUE(0x0000ff),

	/** темно-красный */
	DARK_RED(0xaa0000);

	private final int val;

	/**
	 * 
	 * @param val числовое значение цвета
	 */
	private Color(int val) {
		this.val = val;
	}

	/**
	 * Получить числовое значение цвета.
	 * 
	 * @return RGB значение
	 */
	public int getValue() {
		return val;
	}

	/**
	 * 
	 * @param val
	 * @return
	 */
	public static Color valueOf(int val) {
		for (Color c : Color.values()) {
			if (c.getValue() == val) {
				return c;
			}
		}
		throw new IllegalArgumentException("Unknown color value " + val);
	}

}
