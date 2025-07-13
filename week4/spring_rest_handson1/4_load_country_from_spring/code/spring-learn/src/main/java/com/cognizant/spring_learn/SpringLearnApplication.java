package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) throws Exception {
		LOGGER.info("START");

		// Boot up Spring Boot application
		SpringApplication.run(SpringLearnApplication.class, args);

		// Call methods for each hands-on
		displayDate();      // Hands-on 2: SimpleDateFormat bean
		displayCountry();   // Hands-on 4: Country bean

		LOGGER.info("END");
	}

	public static void displayDate() throws Exception {
		LOGGER.info("START");

		// Load XML config for date format bean
		ApplicationContext context = new ClassPathXmlApplicationContext("date_format.xml");

		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

		Date date = format.parse("31/12/2018");

		LOGGER.debug("Parsed Date: {}", date);

		LOGGER.info("END");
	}

	public static void displayCountry() {
		LOGGER.info("START");

		// Load XML config for country bean
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("country", Country.class);

		LOGGER.debug("Country : {}", country.toString());

		LOGGER.info("END");
	}
}
