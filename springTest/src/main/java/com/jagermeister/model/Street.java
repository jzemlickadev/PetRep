package com.jagermeister.model;

import org.springframework.stereotype.Component;

@Component
public class Street {

	Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void isOk() {
		
		System.out.println("Street is ok");
	}
}
