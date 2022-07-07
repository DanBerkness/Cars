package com.shared.cars.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shared.cars.domain.Car;
import com.shared.cars.repository.CarRepository;

@Controller
public class CarController{
	@Autowired 
	CarRepository carRepository;

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
    public String allCars(Model model) 
    { 
        //list with Cars
        ArrayList<Car>  carsList = new ArrayList<>();
        Car car = new Car();
        car.setColor("red");
        car.setId(36784567856785678L);
        car.setModelName("Corvette");
        carsList.add(car);
        carRepository.findAll();

        model.addAttribute("list", carsList);

        return "cars";
    }
}
