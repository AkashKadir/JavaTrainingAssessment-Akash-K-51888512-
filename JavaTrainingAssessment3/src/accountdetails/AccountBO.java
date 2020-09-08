package accountdetails;

public class AccountBO {

	public FixedAccount getAccountDetail(String detail) {
		
		String[] split = detail.split(",");
		FixedAccount fixAcc = new FixedAccount(split[0],Double.parseDouble(split[1]),split[2],Double.parseDouble(split[3]),Integer.parseInt(split[4]));
		return fixAcc;
	}
	
}
