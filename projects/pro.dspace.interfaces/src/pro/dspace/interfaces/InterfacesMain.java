package pro.dspace.interfaces;

/**
 * Интерфейсы.
 * 
 * @author mom
 *
 */
public class InterfacesMain {
	
	public static void main(String[] args) {
		System.out.println("Интерфейсы");
		
		Shape player = new Player();
		player.render();
		System.out.println(Player.DEFAULT_COLOR);
		
		player.rotateAndMove(3, 4, 0.3);
		
		Bag bag = Bag.getInstance();
		if (bag.isEmpty()) {
			System.out.println("!!!!!! EMPTY");
		} else {
			System.out.println("!!!!!! NOT EMPTY");
		}
	}

}
