package pro.dspace.interfaces;

/**
 * Фигура. Отображаемый на экране объект.
 * 
 * @author mom
 *
 */
public interface Shape {
	
	int DEFAULT_COLOR = 0xFFBACD;

	/**
	 * Отрисовать фигуру.
	 */
	void render();

	/**
	 * Переместить фигуру.
	 * 
	 * @param x
	 * @param y
	 */
	void moveTo(int x, int y);

	/**
	 * Повернуть фигуру.
	 * 
	 * @param angle угол вращения в радианах
	 */
	void rotate(double angle);
	
	/**
	 * Обновить положение фигуры.
	 */
	void update();
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param angle
	 */
	default void rotateAndMove(int x, int y, double angle) {
		rotate(angle);
		moveTo(x, y);
	}
	
}
