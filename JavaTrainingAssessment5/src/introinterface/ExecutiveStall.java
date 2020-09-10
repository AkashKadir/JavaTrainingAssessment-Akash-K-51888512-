package introinterface;

public class ExecutiveStall implements Stall{

	private String stallName;
	private int cost;
	private String ownerName;
	private int screen;
	
	ExecutiveStall(){};
	
	public ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screen = screen;
	}

	@Override
	public void display() {
		System.out.println("Stall name :"+stallName);
		System.out.println("Cost :"+cost);
		System.out.println("Owner Name :"+ownerName);
		System.out.println("Number of Screen :"+screen);		
	}
}
