package pro.dspace.classes;

/**
 * Прямоугольная область.
 * 
 * @author mom
 *
 */
public class Box {

	public int width;

	public int height;
	
	/**
	 * 
	 */
	public Box() {
		System.out.println("Box default constructor");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize()");
	}

	/**
	 * 
	 * @param size размер
	 */
	public Box(int size) {
		height = width = size;
	}

	public Box(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * Вычислить площадь прямоугольника.
	 * 
	 * @return
	 */
	public int area() {
		return width * height;
	}
	
	/**
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.width = this.height = size;
	}
	
	/**
	 * 
	 * @param width
	 * @param height
	 */
	public void setDimensions(int width, int height) {
		this.width = width;
		this.height = height;
	}

}
