package com.osmand.spring.react.example.one;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import reactor.core.publisher.Flux;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringReactExample1ApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void simpleStreamExample() throws Exception {
		Flux<String> dogs = Flux.just("Osmand","Sarvjit","Krishna","Tarun");
		dogs.toStream().forEach(System.out::println);
	}

}
