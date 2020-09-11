package ActorDetails;

public class Film {

	private int Id;
	private String Name;
	private Actor Actors[];
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Actor[] getActors() {
		return Actors;
	}
	public void setActors(Actor[] actors) {
		Actors = actors;
	}
	
}
