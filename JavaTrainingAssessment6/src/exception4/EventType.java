package exception4;

public class EventType {

	private long id;
	private String name;
	
	public EventType(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	EventType(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
