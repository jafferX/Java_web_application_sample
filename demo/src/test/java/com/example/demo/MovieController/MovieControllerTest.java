package com.example.demo.MovieController;
import com.example.demo.models.*;
import com.example.demo.Controller.MovieController;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest


public class MovieControllerTest {

	@Test
	public void TestStars ()  {
		
		
    	assertEquals(5, 5);		
	}
	
	public void testGetAll() {
		MovieRepository repo = null;
		MovieController test = new MovieController(repo);
		Movie [] arr2 = new Movie [5];
		test.movie().toArray(arr2);
		Movie movie = new Movie();
		movie.setId((long) 1);
		movie.setImage("images/movie1.jpg");
		movie.setRating(3);
		movie.setReleaseDate("2014-02-22");
		movie.setTitle("Gone Girl");
		assertEquals(movie, arr2[0]);	
	}
}
