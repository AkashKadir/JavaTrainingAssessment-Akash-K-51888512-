package org.hcl;

import org.hcl.controller.Batsman;
import org.hcl.controller.Bowler;
import org.hcl.controller.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		Transaction trans = session.beginTransaction();
		
		Person person = new Person();
		person.setFirstName("Ravi");
		person.setLastName("Shastri");
		
		Batsman batsMan = new Batsman();
		batsMan.setFirstName("Dhoni");
		batsMan.setLastName("MS");
		batsMan.setTotalRuns(5000);
		batsMan.setType("RightHanded");
		
		Bowler bowler = new  Bowler();
		bowler.setFirstName("Jadega");
		bowler.setLastName("Ravindra");
		bowler.setBowlingType("LegSpin");
		bowler.setWickets(100);
		
		session.persist(person);
		session.persist(bowler);
		session.persist(batsMan);
		trans.commit();
		sessionFact.close();
		session.close();

	}

}
