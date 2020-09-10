package ayupharma;

import java.time.LocalDate;

public class Tablet extends Medicine{

	Tablet(){};
	public Tablet(String name, double price, LocalDate expDate) {
		super(name,price,expDate);
	}
	
	@Override
	protected void displayLabel() {
		System.out.println("Store in cool place.");
	}
	
}
