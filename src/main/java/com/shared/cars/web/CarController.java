package com.shared.cars.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shared.cars.domain.Car;
import com.shared.cars.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	private CarService carService;

	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/create")
	public String createCar(ModelMap model) {// added the modelmap to get access to the car object within html
		Car car = new Car();
		model.put("car", car);
		return "create";
	}
	
	@PostMapping("/create")
	public String createCarPost(Car car) {// I pass in the car object so that when it gets submitted a car object is passed in order to save
		carService.save(car);
		return "redirect:/";
	}

	@GetMapping("/update")
	public String editCar() {
		
		
		return "update";
	}
	
	@GetMapping("/cars")
    public String allCars(Model model) {
		
        //list with Cars
        List<Car>  carsList = carService.findAll();
        model.addAttribute("list", carsList);

        return "cars";
    }
	@GetMapping("/car/{carId}")
	public String viewCar(@PathVariable Long carId, ModelMap model) {
		Car car = carService.findCarById(carId);
		model.put("car", car);
		return "car";
	}
	@PostMapping("/car/{carId}")
	public String updateCar(Car car) {
		carService.save(car);
		return "redirect:/cars";
	}
	
}
