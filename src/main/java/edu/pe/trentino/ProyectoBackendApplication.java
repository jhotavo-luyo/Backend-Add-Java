package edu.pe.trentino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ProyectoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoBackendApplication.class, args);
	}

}
