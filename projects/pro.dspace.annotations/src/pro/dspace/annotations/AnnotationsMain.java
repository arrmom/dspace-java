package pro.dspace.annotations;

import java.lang.reflect.Method;

/**
 * Аннотации.
 * 
 * @author mom
 *
 */
@MyAnnot(value = "Мой класс")
public class AnnotationsMain {
	
	@MyAnnot(value = "Мое поле")
	private int val;

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		System.out.println("--- Аннотации ---");
		AnnotationsMain ob = new AnnotationsMain();
		Class<? extends AnnotationsMain> cls = ob.getClass();
		MyAnnot an = cls.getAnnotation(MyAnnot.class);
		System.out.println("an = " + an);
		System.out.println("an value() = " + an.value());
		Method m = cls.getMethod("method", (Class<?>[]) null);
		MyAnnot ma = m.getAnnotation(MyAnnot.class);
		System.out.println("ma = " + ma);
		System.out.println("ma value() = " + ma.value());
		System.out.println("ma count() = " + ma.count());
	}
	
	@MyAnnot(value = "Мой метод", count = 10)
	public void method() {
		
	}

}
