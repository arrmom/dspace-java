package pro.dspace.classes.inheritance.domain;

/**
 * Страна.
 * 
 * @author mom
 *
 */
public class Country {
	
	private String name;
	
	private Person president;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPresident() {
		return president;
	}

	public void setPresident(Person president) {
		this.president = president;
	}

}
