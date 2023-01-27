package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class MovieController{
    @Autowired
    MovieService movieService;

    @PostMapping("/movies/add-movie")
    public ResponseEntity addMovie(@RequestBody Movie movie){
        String result = movieService.addMovie(movie);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    @PostMapping("/movies/add-director")
    public ResponseEntity addDirector(@RequestBody Director director){
        String result = movieService.addDirector(director);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    @PutMapping("/movies/add-movie-director-pair")
    public ResponseEntity addMovieDirectorPair(@RequestParam("movieName") String movieName,
                                       @RequestParam("directorName") String directorName){
        String result = movieService.addMovieDirectorPair(movieName, directorName);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    @GetMapping("/movies/get-movie-by-name/{name}")
    public ResponseEntity getMovieByName(@PathVariable("name") String movieName){
        Movie result =  movieService.getMovieByName(movieName);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }
    @GetMapping("/movies/get-director-by-name/{name}")
    public ResponseEntity getDirectorByName(@PathVariable("name") String directorName){
        Director result = movieService.getDirectorByName(directorName);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }
    @GetMapping("/movies/get-movies-by-director-name/{director}")
    public ResponseEntity getMoviesByDirectorName(@PathVariable("director") String directorName){
        List result =  movieService.getMoviesByDirectorName(directorName);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }
    @GetMapping("/movies/get-all-movies")
    public ResponseEntity findAllMovies(){

        List result =   movieService.findAllMovies();
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }
    @DeleteMapping("/movies/delete-director-by-name")
    public ResponseEntity deleteDirectorByName(@RequestParam("directorName") String directorName){
        String result =  movieService.deleteDirectorByName(directorName);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @DeleteMapping("/movies/delete-all-directors")
    public ResponseEntity deleteAllDirectors(){

        String result =  movieService.deleteAllDirectors();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
