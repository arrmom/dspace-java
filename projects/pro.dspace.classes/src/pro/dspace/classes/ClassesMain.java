package pro.dspace.classes;

/**
 * 
 * @author mom
 *
 */
public class ClassesMain {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.width = 2;
		box1.height = 3;
		System.out.println("box1:");
		print(box1);
		System.out.println("box1 square = " + box1.calcSquare());
		box1.setSize(8);
		System.out.println("box1 square = " + box1.calcSquare());
		box1.setDimensions(3, 5);
		System.out.println("box1 square = " + box1.calcSquare());
		
		Box box2 = new Box(6);
		System.out.println("box2:");
		print(box2);
		Box box3 = new Box(9, 3);
		System.out.println("box3:");
		print(box3);
	}
	
	private static void print(Box box) {
		System.out.println("width = " + box.width + ", height = " + box.height);
	}

}
