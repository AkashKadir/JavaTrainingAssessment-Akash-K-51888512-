package introinterface;

public class PremiumStall implements Stall{

	private String stallName;
	private int cost;
	private String ownerName;
	private int projector;
	
	PremiumStall(){};
	
	public PremiumStall(String stallName, int cost, String ownerName, int projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
	}

	@Override
	public void display() {
		System.out.println("Stall name :"+stallName);
		System.out.println("Cost :"+cost);
		System.out.println("Owner Name :"+ownerName);
		System.out.println("Number of Projectors :"+projector);
		
	}

}
