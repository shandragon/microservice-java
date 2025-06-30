package br.edu.cerqueira.adailton.microservices.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class);
		System.out.println("--------------------------------------------------");
		System.out.println("Liquibase migrations completed successfully.");
		System.out.println("The database schema is now up to date.");
		System.out.println("--------------------------------------------------");
	}
}
