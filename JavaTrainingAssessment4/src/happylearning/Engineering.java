package happylearning;

public class Engineering extends HLCollege{
	
	private String building_name;
	private int no_of_branches;
	
	Engineering(){};
	
	public Engineering(String regno, String name, String place, String trustee_names,int year, String building_name, int no_of_branches) {
		super(regno,name,place,trustee_names,year);
		this.building_name = building_name;
		this.no_of_branches = no_of_branches;
	}



	public void showBranchDetails() {
		
		System.out.println("Building name :"+building_name);
		System.out.println("Number of Branches :"+no_of_branches);
		
	}
	
}
