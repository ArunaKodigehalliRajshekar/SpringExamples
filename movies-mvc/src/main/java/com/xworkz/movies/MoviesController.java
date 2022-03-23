 package com.xworkz.movies;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoviesController {
	
	@Autowired
	private MovieService movieservice;
	
	public MoviesController() {
		System.out.println(this.getClass().getSimpleName() + "\t object of controller get created");
	}
	
	@GetMapping("/saveMovies.do")
	public ModelAndView saveMovie(String movieName, String actorName , HttpSession httpSession) {
		Long budget = movieservice.calculateBudget(actorName);
		ModelAndView  modelAndView = new ModelAndView("MovieProfile");
		modelAndView.addObject("movieBudget" , budget);
		modelAndView.addObject("movie", movieName);
		 if(httpSession.getAttribute("MovieNameSession") == null) {
			 httpSession.setAttribute("MovieNameFromSession" , movieName);
		 }
		 System.out.println(budget);
		return modelAndView;
	}

}
