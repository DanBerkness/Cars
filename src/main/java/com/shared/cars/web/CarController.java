package com.shared.cars.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/create")
	public String createCar() {
		
		return "create";
	}

	@GetMapping("/update")
	public String editCar() {
		
		
		return "update";
	}
	@GetMapping("/cars")
	public String allCars() {
		
		return "cars";
	}
}
