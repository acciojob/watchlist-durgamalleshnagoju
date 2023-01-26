package com.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

//		MovieRepository movieRepository = new MovieRepository();
//		Movie RRRMovie = new Movie("RRR", 150, 4.5);
//		Movie PokiriMovie = new Movie("Pokiri", 150, 5.0);
//		Movie AthaduMovie = new Movie("Athadu", 150, 4.5);
//		System.out.println(movieRepository.addMovie(RRRMovie));
//		System.out.println(movieRepository.addMovie(PokiriMovie));
//		System.out.println(movieRepository.addMovie(AthaduMovie));
//
//		Director director1 = new Director("Puri",10,4);
//		Director director2 = new Director("Trivikram",10,4);
//		Director director3 = new Director("RajaMouli",10,4);
//		System.out.println(movieRepository.addDirector(director1));
//		System.out.println(movieRepository.addDirector(director2));
//		System.out.println(movieRepository.addDirector(director3));
//
//		System.out.println(movieRepository.addMovieDirectorPair("RRR", "RajaMouli"));
//		System.out.println(movieRepository.addMovieDirectorPair("Pokiri", "Puri"));
//		System.out.println(movieRepository.addMovieDirectorPair("Athadu", "Trivikram"));
//
//		List movies = movieRepository.findAllMovies();
//		System.out.println(movies.toString());
//		System.out.println(movieRepository.deleteDirectorByName("Puri"));;
//		movies = movieRepository.findAllMovies();
//		System.out.println(movies.toString());
//		movies = movieRepository.getMoviesByDirectorName("Trivikram");
//		System.out.println(movies.toString());

		SpringApplication.run(Application.class, args);
	}
}
