package com.nestdigital.moviebackendApp.Controller;

import com.nestdigital.moviebackendApp.Dao.MovieDao;
import com.nestdigital.moviebackendApp.Model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
@Autowired
    private MovieDao dao;

@CrossOrigin(origins = "*")

    @PostMapping(path = "/movieadd",consumes = "application/json",produces = "application/json")
    public String movieadd(@RequestBody MovieModel movie){
    System.out.println(movie.toString());
    dao.save(movie);
        return "{status:success}";
    }
}
