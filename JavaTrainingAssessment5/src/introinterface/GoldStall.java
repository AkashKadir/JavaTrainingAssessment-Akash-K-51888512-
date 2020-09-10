package introinterface;

public class GoldStall implements Stall{

	private String stallName;
	private int cost;
	private String ownerName;
	private int tvSet;
	
	GoldStall(){};

	public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
	}
	
	@Override
	public void display() {
		System.out.println("Stall name :"+stallName);
		System.out.println("Cost :"+cost);
		System.out.println("Owner Name :"+ownerName);
		System.out.println("Numbr of TV :"+tvSet);
		
	}

}
