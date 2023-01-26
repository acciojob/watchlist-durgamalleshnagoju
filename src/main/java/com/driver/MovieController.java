package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class MovieController{
    @Autowired
    MovieService movieService;

    @PostMapping("/movies/add-movie")
    public String addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }
    @PostMapping("/movies/add-director")
    public String addDirector(@RequestBody Director director){

        return movieService.addDirector(director);
    }
    @PutMapping("/movies/add-movie-director-pair")
    public String addMovieDirectorPair(@RequestParam("movieName") String movieName,
                                       @RequestParam("directorName") String directorName){
        return movieService.addMovieDirectorPair(movieName, directorName);
    }
    @GetMapping("/movies/get-movie-by-name/{name}")
    public Movie getMovieByName(@PathVariable("name") String movieName){
        return movieService.getMovieByName(movieName);
    }
    @GetMapping("/movies/get-director-by-name/{name}")
    public Director getDirectorByName(@PathVariable("name") String directorName){
        return movieService.getDirectorByName(directorName);
    }
    @GetMapping("/movies/get-movies-by-director-name/{director}")
    public List getMoviesByDirectorName(@PathVariable("director") String directorName){
        return movieService.getMoviesByDirectorName(directorName);
    }
    @GetMapping("/movies/get-all-movies")
    public List findAllMovies(){
        return movieService.findAllMovies();
    }
    @DeleteMapping("/movies/delete-director-by-name")
    public String deleteDirectorByName(@RequestParam("directorName") String directorName){
        return movieService.deleteDirectorByName(directorName);
    }
    @DeleteMapping("/movies/delete-all-directors")
    public String deleteAllDirectors(){
        return movieService.deleteAllDirectors();
    }
}
