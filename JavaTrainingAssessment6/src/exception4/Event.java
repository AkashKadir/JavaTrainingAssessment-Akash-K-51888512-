package exception4;

import java.io.PrintStream;

public class Event {

	private String name;
	private String details;
	private String ownerName;
	private long typeId;	
	
	Event(){};
	
	public Event(String name, String details, String ownerName, long typeId) {
		super();
		this.name = name;
		this.details = details;
		this.ownerName = ownerName;
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		String toStr = String.format("%-15s%-15s%-15s%-15s",name,details,ownerName,typeId);
		return toStr;
		
	}
	
}
