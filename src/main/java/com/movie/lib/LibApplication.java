package com.movie.lib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class LibApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibApplication.class, args);
	}

}
