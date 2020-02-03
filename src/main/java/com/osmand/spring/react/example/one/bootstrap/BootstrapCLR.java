package com.osmand.spring.react.example.one.bootstrap;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.osmand.spring.react.example.one.domain.Movie;
import com.osmand.spring.react.example.one.repositories.MovieRepository;

import reactor.core.publisher.Flux;

@Component
public class BootstrapCLR implements CommandLineRunner {
	
	private final MovieRepository movieRepository;
	
	public BootstrapCLR(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		movieRepository.deleteAll().block();
		
		Flux.just("Silence of the Lambs", "Independence Day", "Terminator", "Appolo 13", "Back to Future", "Wizard of Oz", "Despicables","Lord of the Rings","Jack Ryan","Day After Tomorrow").
		map(title -> new Movie(title, UUID.randomUUID().toString())).
		flatMap(movieRepository::save).
		subscribe(null, null, () -> { 
			movieRepository.findAll().subscribe(System.out::println);
			});

	}

}
