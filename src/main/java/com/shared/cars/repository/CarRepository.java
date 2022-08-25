package com.shared.cars.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.shared.cars.domain.Car;
import com.shared.cars.service.SeedService;

@Repository
public class CarRepository {
private List<Car> cars = new ArrayList<>(100);
	

	@Autowired
	private SeedService seedService;
	
	public List<Car> findAll () {
		if (cars.size() == 0) {
			cars.addAll(seedService.carCreation());
		}
		return cars;
	}

	public void save(Car car) {
		if (cars.size() == 0) {// I copied pasted the code above since in order to crea the 10 deafults you need to go to /cars page first
								//so if i save a car before loading the car page it wouldnt save create the default 10
			cars.addAll(seedService.carCreation());
		}//test
		Long id = (long) cars.size();
		car.setId(++id);
		cars.add(car);
	}
}

