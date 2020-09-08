package accountdetails;

public class SavingAccount extends Account{

	protected double minimunBalance;

	public double getMinimunBalance() {
		return minimunBalance;
	}

	public void setMinimunBalance(double minimunBalance) {
		this.minimunBalance = minimunBalance;
	}

	public SavingAccount(String accNo, Double balance,String accName,double minimunBalance) {
		super(accNo,balance,accName);
		this.minimunBalance = minimunBalance;
	}

	
}
