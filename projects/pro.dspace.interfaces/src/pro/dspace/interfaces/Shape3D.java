package pro.dspace.interfaces;

/**
 * Фигура 3D.
 * 
 * @author mom
 *
 */
public interface Shape3D extends Shape {
	
	void rotate(double angle, int dx, int dy, int dz);

}
