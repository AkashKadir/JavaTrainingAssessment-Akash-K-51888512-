package org.handson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws IOException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("handson5Context.xml");
		Owner owner = context.getBean(Owner.class);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name,password and mobile number of the user:");
		String name = br.readLine();
		String password = br.readLine();
		String mobileNumber = br.readLine();
		
		owner.setDetails(name, password, mobileNumber);
		owner.display();
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
