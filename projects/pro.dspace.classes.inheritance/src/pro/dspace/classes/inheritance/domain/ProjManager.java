package pro.dspace.classes.inheritance.domain;

/**
 * Менеджер проектов.
 * 
 * @author mom
 *
 */
public class ProjManager extends Employee {
	
	private Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
