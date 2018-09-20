package pro.dspace.classes.inheritance.domain;

/**
 * Сотрудник компании.
 * 
 * @author mom
 *
 */
public class Employee extends Person {
	
	private int salary;
	
	private Department department;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
