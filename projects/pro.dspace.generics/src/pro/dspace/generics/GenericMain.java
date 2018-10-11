package pro.dspace.generics;

/**
 * Обобщения (Generics).
 * 
 * @author mom
 *
 */
public class GenericMain {

	public static void main(String[] args) {
		System.out.println("--- Обобщения ---");
		Gen<Integer> iOb = new Gen<Integer>(200);
		iOb.showType();
		System.out.println("Значение: " + iOb.getObj());
		//
		Gen<String> sOb = new Gen<String>("Hello!");
		sOb.showType();
		System.out.println("Значение: " + sOb.getObj());
		//
		Gen2<Double, Boolean> ob2 = new Gen2<>();
		ob2.setElem(123.23);
		ob2.setCallback(true);
		ob2.showTypes();
		//
		Stats<Integer> istats = new Stats<>(1, 2, 3);
		System.out.println("istats av = " + istats.average());
		Stats<Float> fstats = new Stats<>(2.0f, 5.0f);
		System.out.println("fstats av = " + fstats.average());
		//
		Bounded<SpecClass> bound = new Bounded<>();
		//
		GenClass<Boolean> obj4 = new GenClass<>();
		GenClass2 obj5 = new GenClass2(22d);
		//
		System.out.println("GenMethod.max(20, 15) = " + GenMethod.max(20, 15));
		System.out.println("GenMethod.max(15, 20) = " + GenMethod.max(15, 20));
		System.out.println("GenMethod.max(\"Bill\", \"John\") = " + GenMethod.max("Bill", "John"));
		System.out.println("GenMethod.max(true, false) = " + GenMethod.max(true, false));
		//
		Stats<Integer> istats2 = new Stats<>(5, 2);
		System.out.println("fstats.sameAverageAs(new Stats<Double>(1d, 2d, 3d)) = "
				+ fstats.sameAverageAs(new Stats<Double>(1d, 2d, 3d)));
		//
		Pair<Boolean, String> pair = new Pair<Boolean, String>(true, "Text");
		System.out.println("pair = " + pair);
	}

}
