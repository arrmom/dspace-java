package pro.dspace.classes.inheritance.domain;

/**
 * Компания.
 * 
 * @author mom
 *
 */
public class Company {
	
	private Country country;
	
	private Department[] departments;
	
	private Employee director;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}

	public Employee getDirector() {
		return director;
	}

	public void setDirector(Employee director) {
		this.director = director;
	}

}
