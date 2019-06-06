package com.lab.lab28.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.lab.lab28.entity.WeatherAPI;


@Controller
public class WeatherController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		RestTemplate rt = new RestTemplate();
		WeatherAPI w = rt.getForObject("https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json", WeatherAPI.class);
		return new ModelAndView("index","wAPI", w);
	}
}
