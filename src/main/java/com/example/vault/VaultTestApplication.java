package com.example.vault;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class VaultTestApplication implements CommandLineRunner {

	@Value("${password}")
	String password;

	public static void main(String[] args) {
		SpringApplication.run(VaultTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("My password is: " + password);
	}


/*	@PostConstruct
	private void postConstruct() {
		System.out.println("My password is: " + password);
	}*/

}
