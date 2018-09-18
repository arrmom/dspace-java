package pro.dspace.classes.inheritance;

/**
 * Коробка с весом.
 * 
 * @author mom
 *
 */
public class WeightedBox extends Box {
	
	double weight;
	
	public WeightedBox() {
		System.out.println("WeightedBox()");
		weight = -1;
	}

	public WeightedBox(double height, double width, double depth, double weight) {
		super(height, width, depth);
		System.out.println("WeightedBox(..)");
		this.weight = weight;
	}
	
	public void setDepth(double depth) {
		super.depth = depth;
	}

	@Override
	public double volume() {
		System.out.println("WeightedBox.volume()");
		return super.volume();
	}
	
}
