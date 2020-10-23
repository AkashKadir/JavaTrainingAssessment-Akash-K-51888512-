package org.hcl.controller;

import javax.persistence.*;

@Entity
@Table(name="cricket")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Category",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="coach")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected int Id;
	private String firstName;
	private String lastName;
	public int getId() {
		return Id;
	}
	public void setPersonId(int Id) {
		this.Id = Id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Person(int Id, String firstName, String lastName) {
		super();
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person(){}
	
}
