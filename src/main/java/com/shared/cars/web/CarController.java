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
<<<<<<< HEAD
public class CarController {
	
	@Autowired
	private CarRepository carRepository;
=======
public class CarController{
	@Autowired 
	CarRepository carRepository;
>>>>>>> bfdea4620a58d68f0a45cd84eeda4fc10edc9f53

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
<<<<<<< HEAD
    public String allCars(Model model) {
        //list with Cars
        List<Car>  carsList = carRepository.findAll();
       
=======
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

>>>>>>> bfdea4620a58d68f0a45cd84eeda4fc10edc9f53
        model.addAttribute("list", carsList);

        return "cars";
    }
}
