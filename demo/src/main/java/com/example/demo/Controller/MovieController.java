package com.example.demo.Controller;
import com.example.demo.models.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class MovieController {
	private MovieRepository repo;
	
	public MovieController(MovieRepository repo) {
		this.repo = repo;
	}
	@GetMapping("/movies")
	@CrossOrigin(origins = "http://localhost:4200")
	public Collection<Movie> movie() {
		return repo.findAll().stream()
				.collect(Collectors.toList());
	}
	
	@GetMapping("/stars")
	@CrossOrigin(origins = "http://localhost:4200")
	public Collection<Integer> rating() {
		return repo.findAll().stream().map(Movie::getRating)
				.collect(Collectors.toList());
	}
	
}
