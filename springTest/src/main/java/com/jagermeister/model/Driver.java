package com.jagermeister.model;

import org.springframework.context.annotation.Primary;

@Primary
public class Driver implements Person {
	
	
	public void getActivity() {
		
		System.out.println("I am just riding");
	}

}
