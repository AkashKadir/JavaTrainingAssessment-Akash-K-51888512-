package exception4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static EventType et = new EventType();
	static long reId =0; 
	
	static Event[] ev;
	static int count;
	public static void main(String[] args){
		
		List<EventType> li = new ArrayList<EventType>();
		li.add(new EventType((long)1,"Stage Event"));
		li.add(new EventType((long)2,"Exhibition"));
		li.add(new EventType((long)3,"Sports Meet"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of events :");
		
		int number = sc.nextInt();
		sc.nextLine();
		ev = new Event[number];
		
		for(int i=1;i<=number;i++) {
			
			System.out.println("Enter the details of event "+i);		
			String event = sc.nextLine();
			String[] split = event.split(",");
			reId = Long.parseLong(split[3]);
			count=0;
			while(!(isValid(reId,li))){
				try {
						throw new EventTypeDoesNotExistsException("No event type available with the given id");
					}
				catch (EventTypeDoesNotExistsException e) {
					System.out.println("\nEnter the correct event type id :");
					reId = sc.nextLong();
				}
				
			count++;
			}
			if(count>0) {
				sc.nextLine();
			}
			ev[i-1]=new Event(split[0],split[1],split[2],reId);			
		}
		System.out.format("\n%-15s%-15s%-15s%-15s\n\n" ,"Name","Details","Ownername","EventTypeId");
		
		for(int j=0;j<number;j++) {
			System.out.println(ev[j].toString());
		}
		
	}

	public static Boolean isValid(Long typeId,List<EventType> typeList) {
		
		for(int i=0;i<typeList.size();i++) {
			if(typeId==typeList.get(i).getId()) {
				return true;
			}
		}
		return false;		
	}
	
}
