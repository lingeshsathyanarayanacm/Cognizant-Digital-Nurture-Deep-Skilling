package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.info("START");
		SpringApplication.run(SpringLearnApplication.class, args);

		// Call the methods for hands-on exercises:
		displayCountry();
		displayCountries();
		displayDate();

		LOGGER.info("END");
	}

	public static void displayCountry() {
		LOGGER.info("START - displayCountry()");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("in", Country.class);
		LOGGER.debug("Country : {}", country.toString());

		// Singleton vs Prototype demonstration
		Country anotherCountry = context.getBean("in", Country.class);
		LOGGER.debug("Another Country : {}", anotherCountry.toString());

		LOGGER.info("END - displayCountry()");
	}

	public static void displayCountries() {
		LOGGER.info("START - displayCountries()");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		java.util.List<Country> countryList = context.getBean("countryList", java.util.ArrayList.class);
		LOGGER.debug("Country List : {}", countryList.toString());

		LOGGER.info("END - displayCountries()");
	}

	public static void displayDate() {
		LOGGER.info("START - displayDate()");
		ApplicationContext context = new ClassPathXmlApplicationContext("date_format.xml");

		java.text.SimpleDateFormat format = context.getBean("dateFormat", java.text.SimpleDateFormat.class);
		try {
			java.util.Date date = format.parse("31/12/2018");
			LOGGER.debug("Date : {}", date);
		} catch (java.text.ParseException e) {
			LOGGER.error("ParseException", e);
		}

		LOGGER.info("END - displayDate()");
	}
}
