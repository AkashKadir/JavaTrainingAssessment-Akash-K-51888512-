package ayupharma;

import java.time.LocalDate;

public class Syrup extends Medicine{

	public Syrup(String name, double price, LocalDate expDate) {
		super(name, price, expDate);
	}

	@Override
	protected void displayLabel() {
		System.out.println("Take physician's advice");
		System.out.println("Dosage :");
		System.out.println("Adult :2spoons twice a day");
		System.out.println("Children : 1spoon twice a day");
		
	}

}
