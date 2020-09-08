package overloadingbasic;

public class Stall {

	protected String name;
	protected String detail;
	protected String ownerName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public static Double computeCost(String stallType, Integer squareFeet) {
		
		double calc;
		
		if(stallType.equals("Platinum")) 
			calc=squareFeet*200;
			
		else if(stallType.equals("Diamond")) 
			calc=squareFeet*150;
			
		
		else if(stallType.equals("Gold"))
			calc=squareFeet*100;
			
		else
			calc=0;
			
		return calc;
		
	}
	
	public static Double computeCost(String stallType, Integer squareFeet, Integer numberOfTV) {
		
		double calc;
		
		if(stallType.equals("Platinum")) 
			calc=squareFeet*200;
			
		else if(stallType.equals("Diamond")) 
			calc=squareFeet*150;
			
		
		else if(stallType.equals("Gold"))
			calc=squareFeet*100;
			
		else
			calc=0;
			
		calc+=(numberOfTV*10000);
		
		return calc;
	}
	
}
