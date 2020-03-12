package com.ravina.movieinfoservice.controller;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravina.movieinfoservice.model.Movie;



@RestController
@RequestMapping("/movies")
public class MovieResource{

	@RequestMapping("/{movieId}")
	public Movie getCatalog(@PathVariable("movieId") String movieId) {
		
		return new Movie(movieId,"ARANMANI");

	}
}