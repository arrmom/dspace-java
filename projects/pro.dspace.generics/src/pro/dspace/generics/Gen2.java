package pro.dspace.generics;

/**
 * 
 * @author mom
 *
 * @param <Element>
 * @param <Callback>
 */
public class Gen2<Element, Callback> {

	private Element elem;

	private Callback callback;

	public void showTypes() {
		System.out.println("elem type is " + elem.getClass() + ", callback type is " + callback.getClass());
	}

	public Callback getCallback() {
		return callback;
	}

	public void setCallback(Callback callback) {
		this.callback = callback;
	}

	public Element getElem() {
		return elem;
	}

	public void setElem(Element elem) {
		this.elem = elem;
	}

}
