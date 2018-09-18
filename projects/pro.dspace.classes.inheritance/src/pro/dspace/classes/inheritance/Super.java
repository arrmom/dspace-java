package pro.dspace.classes.inheritance;

/**
 * Использование super.
 * 
 * @author mom
 *
 */
public class Super {

	public void execute() {
		System.out.println("-- super --");
		Box box = new Box(1, 2, 3);
		System.out.println("box vol = " + box.volume());
		System.out.println("box2:");
		WeightedBox box2 = new WeightedBox(3, 5, 1, 7);
		System.out.println("box3:");
		WeightedBox box3 = new WeightedBox();
		
		System.out.println("box2 vol = " + box2.volume());
	}

}
