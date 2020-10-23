package org.hcl.Controllers;

public class ProjectLead extends Company{
	
	private int exp;
	private String Project;
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	public String getProject() {
		return Project;
	}
	public void setProject(String project) {
		Project = project;
	}
	public ProjectLead(int id, String firstName, String lastName, String sapId, long bonus, double salary,
			String Project, int exp) {
		super(id, firstName, lastName, sapId, bonus, salary);
		this.exp = exp;
		this.Project=Project;
	}
	public ProjectLead(){}
	
}
