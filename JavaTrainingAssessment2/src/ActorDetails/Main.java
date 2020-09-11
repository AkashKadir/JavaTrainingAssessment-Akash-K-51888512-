package ActorDetails;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Film Details : (id,name)");
		String filmDetail = sc.nextLine();
		
		System.out.println("How many Actors: ?");
		int noOfActors = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Actors : (id,name,contact)");
		Film f = new Film();
		f.setId(Integer.parseInt(filmDetail.split(",")[0]));
		f.setName(filmDetail.split(",")[1]);
		Actor[] actors = new Actor[noOfActors];
		
		for(int i = 0 ; i<noOfActors ;i++) {
			Actor actor = new Actor();
			String actorDetails = sc.nextLine();
			String[] split = actorDetails.split(",");
			actor.setId(Integer.parseInt(split[0]));
			actor.setName(split[1]);
			actor.setContact_no(split[2]);
			actors[i] = actor;
		}
		
		f.setActors(actors);	
		
		System.out.println("Film Details :");
		System.out.println("Film name: " + f.getName());
		Actor[] actors2 = f.getActors();
		System.out.println("Actors :");
		for(int i=0;i<actors2.length;i++)
		{
			System.out.println(actors2[i].getName() + " " + actors2[i].getContact_no());
		}
		sc.close();
	}
}

	
	
	