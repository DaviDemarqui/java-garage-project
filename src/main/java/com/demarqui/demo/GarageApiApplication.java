package com.demarqui.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration //Tags the class as a source of bean definitions for the application context.
@EnableAutoConfiguration // Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
@ComponentScan //Tells Spring to look for other components, configurations, and services
public class GarageApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageApiApplication.class, args);
	} 

}
