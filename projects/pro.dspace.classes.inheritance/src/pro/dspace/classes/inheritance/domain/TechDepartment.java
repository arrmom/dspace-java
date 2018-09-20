package pro.dspace.classes.inheritance.domain;

/**
 * 
 * @author mom
 *
 */
public class TechDepartment extends Department {
	
	private Employee systemAdministrator;

	public Employee getSystemAdministrator() {
		return systemAdministrator;
	}

	public void setSystemAdministrator(Employee systemAdministrator) {
		this.systemAdministrator = systemAdministrator;
	}

}
