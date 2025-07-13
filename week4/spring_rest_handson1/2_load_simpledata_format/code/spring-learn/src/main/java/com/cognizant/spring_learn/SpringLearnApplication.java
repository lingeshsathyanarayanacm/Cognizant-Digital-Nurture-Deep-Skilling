package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("START");

		// Run the Spring Boot app
		SpringApplication.run(SpringLearnApplication.class, args);

		// Call the displayDate method
		displayDate();

		System.out.println("END");
	}

	public static void displayDate() throws Exception {
		// Load the Spring context from the XML configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("date_format.xml");

		// Get the dateFormat bean
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

		// Parse the date
		Date date = format.parse("31/12/2018");

		// Display the result
		System.out.println("Parsed Date: " + date);
	}
}
