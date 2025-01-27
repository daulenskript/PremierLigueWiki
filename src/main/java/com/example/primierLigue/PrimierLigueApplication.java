package com.example.primierLigue;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimierLigueApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimierLigueApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(PlayerRepository repository) {
		return args -> {
			repository.findAll().forEach(System.out::println);
		};
	};
}
