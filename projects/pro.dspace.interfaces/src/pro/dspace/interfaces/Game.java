package pro.dspace.interfaces;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author mom
 *
 */
public class Game {
	
	private final List<Shape> shapes = new LinkedList<>();
	
	private boolean theEnd;

	public void run() {
		// TODO: заполняем shapes
		while (!theEnd) {
			for(Shape shape: shapes) {
				shape.update();
			}
			for(Shape shape: shapes) {
				shape.render();
			}
		}
	}
	
	public List<Shape> getShapes() {
		return shapes;
	}

}
