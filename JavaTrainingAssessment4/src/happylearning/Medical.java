package happylearning;

public class Medical extends HLCollege{
	
	private String building_name;
	private int no_of_branches;
	private boolean attached_hospital;
	
	
	public Medical(String regno, String name, String place, String trustee_names,int year, String building_name, int no_of_branches,boolean attached_hospital) {
		super(regno,name,place,trustee_names,year);
		this.building_name = building_name;
		this.no_of_branches = no_of_branches;
		this.attached_hospital = attached_hospital;
	}

	public void showBranchDetails() {
		System.out.println("Building name :"+building_name);
		System.out.println("Number of Branches :"+no_of_branches);
		if(attached_hospital==true) {
			System.out.println("College has Hospital");
		}
		else {
			System.out.println("College is not having Hospital");
		}
	}
	
	public void getInternshipInfo() {
		System.out.println("Internship Details :");
		System.out.println("\t Student passed with >90% in all semesters ---internship in self college");
		System.out.println("\t Student passed with 80-89% in all semesters ---internship in city");
		System.out.println("\t Student passed with 70-79% in all semesters ---internship in villages near city");
	}
	
}
