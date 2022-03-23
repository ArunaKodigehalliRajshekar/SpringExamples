package com.xworkz.movies;

import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class MovieService {

	public Long calculateBudget(String actorName) {
		Long budget = 5000l;
		if(Objects.isNull(actorName) || actorName.isEmpty()) {
			return null;
		}else if (actorName.equalsIgnoreCase("punith")) {
			budget =6000l;
		}else if (actorName.equalsIgnoreCase("yash")) {
			budget=5001l;
		}else if (actorName.equalsIgnoreCase("uppi")) {
			budget=10000l;
		}
		return budget;
		
		
	}

}
