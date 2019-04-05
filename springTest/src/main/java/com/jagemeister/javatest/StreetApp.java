package com.jagemeister.javatest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jagermeister.dao.HouseDaoImpl;
import com.jagermeister.model.House;
import com.jagermeister.model.Street;
import com.jagermeister.model.Walker;

public class StreetApp {
   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		  AnnotationConfigApplicationContext context = new
		  AnnotationConfigApplicationContext(AppConfig.class); 
		  
		  
		  
		  Street street = context.getBean("getStreet",Street.class); 
		  street.getPerson().getActivity();;
		  street.isOk();
		  
		  Walker walker = context.getBean("getWalker",Walker.class); 
		  walker.getActivity();
		  walker.getId();
		  walker.getName();
		  
		  HouseDaoImpl houseDaoImpl = new HouseDaoImpl();
		  houseDaoImpl.getHouseName();
		  
		  int co = houseDaoImpl.createD();
		  
		  
		  context.close();
		 
		  
		
	}

}
