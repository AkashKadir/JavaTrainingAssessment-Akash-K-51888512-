package happylearning;

public class HLCollege {
	
	private String registration_no;
	private String name;
	private String place;
	private String trustee_names;
	private int foundation_year;
	
	HLCollege(){};
	
	public HLCollege(String registration_no, String name, String place, String trustee_names, int foundation_year) {
		super();
		this.registration_no = registration_no;
		this.name = name;
		this.place = place;
		this.trustee_names = trustee_names;
		this.foundation_year = foundation_year;
	}

	public void showCollegeInfo() {
		
		System.out.println("Register Number is :"+registration_no);
		System.out.println("College Name :"+name);
		System.out.println("City of College :"+place);
		String[] split = trustee_names.split(",");
		System.out.println("Trustees :"+"\n"+split[0]+"\n"+split[1]+"\n"+split[2]);
		System.out.println("Foundation Year :"+foundation_year);
		
	}
	
}
