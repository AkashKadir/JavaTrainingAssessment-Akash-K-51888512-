package org.hcl.Controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		Transaction tx = session.beginTransaction();
		
		Company company= new Company();
		company.setFirstName("HCL");
		
		Employee emp = new Employee();
		emp.setFirstName("Akash");
		emp.setLastName("Kadhir");
		emp.setSapId("51888512");
		emp.setSalary(23000);
		emp.setExp(1);
		
		Manager manager = new Manager();
		manager.setFirstName("Karthick");
		manager.setLastName("Subbaraj");
		manager.setBonus(2300);
		manager.setExp(10);
		manager.setProject("USAA");
		manager.setSalary(45000);
		manager.setSapId("3199900");
		
		ProjectLead lead = new ProjectLead();
		lead.setFirstName("Subbarao");
		lead.setLastName("Ksrao");
		lead.setBonus(30000);
		lead.setExp(5);
		lead.setSapId("430023");
		lead.setProject("Airline");
		
		session.persist(lead);
		session.persist(manager);
		session.persist(company);
		session.persist(emp);
		
		tx.commit();
		session.close();
		sessionFact.close();

	}

}
