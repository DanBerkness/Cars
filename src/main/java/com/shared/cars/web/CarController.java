package com.shared.cars.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shared.cars.domain.Car;

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
    public String allCars(Model model) 
    {
        //list with Cars
        ArrayList<Car>  carsList = new ArrayList<>();
        Car car = new Car();
        car.setColor("red");
        car.setId(36784567856785678L);
        car.setModelName("Corvette");
        carsList.add(car);

        model.addAttribute("list", carsList);

        return "cars";
    }
}
