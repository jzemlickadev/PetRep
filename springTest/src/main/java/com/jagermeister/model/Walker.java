package com.jagermeister.model;



public class Walker implements Person{

	int id;
	String name;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void getActivity() {
		System.out.println("I am just walking");
	}
		
}
