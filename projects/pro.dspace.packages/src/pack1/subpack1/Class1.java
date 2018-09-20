package pack1.subpack1;

import pack1.MyClass;
import pack2.Enum1;

import static pack1.MyClass.*;

import java.util.logging.Filter;

public class Class1 {
	
	private MyClass obj;
	
	private Enum1 enum1;
	
	private pack2.MyClass obj2;
	
	private Filter filter;

	public Class1() {
		obj = new MyClass();
		obj.method2();
//		obj.value = 2; ERROR !
		field = 2;
		method();
	}

	public MyClass getObj() {
		return obj;
	}

	public void setObj(MyClass obj) {
		this.obj = obj;
	}

	public Enum1 getEnum1() {
		return enum1;
	}

	public void setEnum1(Enum1 enum1) {
		this.enum1 = enum1;
	}

	public pack2.MyClass getObj2() {
		return obj2;
	}

	public void setObj2(pack2.MyClass obj2) {
		this.obj2 = obj2;
	}

}
