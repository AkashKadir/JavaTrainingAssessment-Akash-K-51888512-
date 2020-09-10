package ayupharma;

import java.time.LocalDate;

public class Ointment extends Medicine{

	public Ointment(String name, double price, LocalDate expDate) {
		super(name, price, expDate);
	}

	@Override
	protected void displayLabel() {
		System.out.println("For external use only.");
		
	}

}
