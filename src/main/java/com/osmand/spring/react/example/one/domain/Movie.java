package com.osmand.spring.react.example.one.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Document
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Movie {
	
	private String id;
	
	@NonNull
	private String title;
	
	public Movie(String title, String id) {
		this.id = id;
		this.title = title;
	}
	
}
