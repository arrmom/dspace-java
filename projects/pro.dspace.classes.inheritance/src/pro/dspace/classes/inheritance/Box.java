package pro.dspace.classes.inheritance;

import java.util.Date;

/**
 * Коробка (параллелепипед).
 * 
 * @author mom
 *
 */
public class Box {
	
	/** высота */
	double height;
	/** ширина */
	double width;
	/** глубина */
	double depth;
	
	private Date created;
	
	public Box() {
		System.out.println("Box()");
		height = -1;
		width = -1;
		depth = -1;
		created = new Date();
	}
	
	public Box(double height, double width, double depth) {
		System.out.println("Box(...)");
		this.height = height;
		this.width = width;
		this.depth = depth;
		created = new Date();
	}

	/**
	 * Вычислить объект коробки.
	 * 
	 * @return
	 */
	public double volume() {
		return height * width * depth;
	}
	
	private void printCreated() {
		System.out.println("created = " + created);
	}
	
}
