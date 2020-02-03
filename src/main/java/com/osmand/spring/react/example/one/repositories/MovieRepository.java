package com.osmand.spring.react.example.one.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.osmand.spring.react.example.one.domain.Movie;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String>{

}
