package addresssplit;

public class Address {
	
	private int userId;
	private String street;
	private String city;
	private String state;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Address(int userId, String street, String city, String state) {
		super();
		this.userId = userId;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	Address(){};
	
}
