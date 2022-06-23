package com.shared.cars.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = "/showTableWithValues", method = RequestMethod.GET)
    public String showTableWithValues(Model model) 
    {
        //list with Persons
        ArrayList<Cars>  carsList= 
                new ArrayList<Cars>();

        carsList=  this.getListOfCars();

        model.addAttribute("list", carsList);

        return "showTableWithValues";
    }
}
