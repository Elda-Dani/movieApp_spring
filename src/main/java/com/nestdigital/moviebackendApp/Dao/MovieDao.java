package com.nestdigital.moviebackendApp.Dao;

import com.nestdigital.moviebackendApp.Model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<MovieModel,Integer> {
}
