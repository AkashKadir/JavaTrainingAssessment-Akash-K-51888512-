package exception4;

public class EventTypeDoesNotExistsException extends Exception{
	
	EventTypeDoesNotExistsException(String description){
		super(description);
		System.out.println(EventTypeDoesNotExistsException.super.toString());
	}

}
