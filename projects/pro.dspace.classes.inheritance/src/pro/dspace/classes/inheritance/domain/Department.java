package pro.dspace.classes.inheritance.domain;

/**
 * Отдел.
 * 
 * @author mom
 *
 */
public class Department {
	
	private Company company;
	
	/** начальник отдела */
	private Employee head;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Employee getHead() {
		return head;
	}

	public void setHead(Employee head) {
		this.head = head;
	}
	
}
