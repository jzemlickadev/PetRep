package com.jagermeister.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.jagermeister.model.House;


@Component
public class HouseDaoImpl {

	
	  @Autowired 
	  DataSource dataSource;
	  
	  @Autowired
	  House house;

		
		
	public void getHouseName() {
		
		System.out.println("peters house");
	}
		
	
	public int createD() {
		  
		String sql = "CREATE TABLE HOUSE " + "(num INT, " + " street VARCHAR(255))";		  
		Connection con;
		  
		try {
			
		 con = dataSource.getConnection();
	
		 Statement st = con.createStatement(); 
		 st.executeUpdate(sql);
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  
		  return 1;

	}

		  
		  
	public int createDb() {

		try {

			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hibTest", "postgres","demon");
			
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate("CREATE TABLE HOUSE " + "(num INT, " + " street VARCHAR(255))");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 1;
	}
	
	
	

	/*
	 * public int createItem(House house) {
	 * 
	 * String num = Integer.toString(house.getNum()); String street =
	 * house.getStreet(); String sql = "INSERT INTO HOUSE " +
	 * "VALUES("+num+","+street+")"; try { Connection con =
	 * dataSource.getConnection(); Statement st = con.createStatement();
	 * 
	 * st.executeUpdate(sql); } catch (SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * 
	 * return 1; }
	 */

}
