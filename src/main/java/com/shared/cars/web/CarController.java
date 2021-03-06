package com.shared.cars.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shared.cars.domain.Car;
import com.shared.cars.repository.CarRepository;

@Controller
public class CarController {
	
	@Autowired
	private CarRepository carRepository;

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
    public String allCars(Model model) {
        //list with Cars
        List<Car>  carsList = carRepository.findAll();
       
        model.addAttribute("list", carsList);

        return "cars";
    }
}
