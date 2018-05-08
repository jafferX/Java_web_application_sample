package com.example.demo;
import com.example.demo.models.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

import java.io.File;




@SpringBootApplication
public class MovieRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init (MovieRepository repo) {
		return arg -> {
			ObjectMapper objectMapper = new ObjectMapper ();
			File file = new File ("movies.json");
			Movie [] movie = objectMapper.readValue(file, Movie[].class);
			for (Movie i : movie) {
				repo.save(i);
			}
		};
	}
}
