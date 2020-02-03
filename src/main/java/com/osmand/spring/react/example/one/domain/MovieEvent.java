package com.osmand.spring.react.example.one.domain;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
//@AllArgsConstructor
public class MovieEvent {
	
	private String movieId;
	private Date date;
	
	public MovieEvent(String movieId, Date date) {
		this.date = date;
		this.movieId = movieId;
	}

}
