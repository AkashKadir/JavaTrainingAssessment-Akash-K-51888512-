package overridingsimple;

public class Exhibition extends Event{

	private int noOfStall;

	Exhibition(){}
	
	public Exhibition(String name,String detail,String ownername,int noOfStall) {
		super(name,detail,ownername);
		this.noOfStall = noOfStall;
	}
	
	public Double projectedRevenue() {
		
		double rev = noOfStall*10000;
		return rev;
		
	}
	
}
