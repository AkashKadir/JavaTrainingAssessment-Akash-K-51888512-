package overridingsimple;

public class StageEvent extends Event{

	private int noOfShow;
	private int noOfSeatPerShow;
	
	StageEvent(){};
	
	public StageEvent(String name,String detail,String ownername,int noOfShow, int noOfSeatPerShow) {
		super(name,detail,ownername);
		this.noOfShow = noOfShow;
		this.noOfSeatPerShow = noOfSeatPerShow;
	}
	
	public Double projectedRevenue() {
		
		double rev = noOfSeatPerShow*noOfShow*50;
		return rev;
		
	}
	
}
