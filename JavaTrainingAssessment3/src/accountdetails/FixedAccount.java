package accountdetails;

public class FixedAccount extends SavingAccount{
	
	private int lockingPeriod;

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	
	
	public FixedAccount(String accNo, double balance,String accName,double minBalance,int lockingPeriod) {
		super(accNo,balance,accName,minBalance);
		this.lockingPeriod = lockingPeriod;
	}
	
	

}
