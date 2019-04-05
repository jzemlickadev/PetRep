package com.jagemeister.javatest;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.jagermeister.model.Driver;
import com.jagermeister.model.Person;
import com.jagermeister.model.Street;
import com.jagermeister.model.Walker;


@Configuration
@ComponentScan(basePackages="com.jagemeister")
@ImportResource("classpath:/Spring.xml")
public class AppConfig {

	@Bean
	public Person getWalker() {
		
	return new Walker();
	}
	
	@Bean 
	public Person getDriver() {	
	return new Driver();
	}
	
	@Bean 
	public Street getStreet() {
		
		Street street = new Street();
		street.setPerson(getDriver());
	
		return street;
	}
	
	/*
	 * @Bean public DataSource dataSource() { DriverManagerDataSource dataSource =
	 * new DriverManagerDataSource();
	 * dataSource.setDriverClassName("org.postgresql.Driver");
	 * dataSource.setUrl("jdbc:postgresql://localhost:5432/hibTest");
	 * dataSource.setUsername("postgres"); dataSource.setPassword("demon"); return
	 * dataSource;
	 * 
	 * }
	 */
	
	
}
