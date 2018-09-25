package pro.dspace.interfaces;

/**
 * Игрок.
 * 
 * @author mom
 *
 */
public class Player implements Shape {
	
	private int x;
	
	private int y;
	
	/** текущий угол поворота */
	private double angle;

	@Override
	public void render() {
		System.out.println("** Player **");
	}

	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void rotate(double angle) {
		this.angle += angle;
	}

	@Override
	public String toString() {
		return "Player [x=" + x + ", y=" + y + ", angle=" + angle + "]";
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
