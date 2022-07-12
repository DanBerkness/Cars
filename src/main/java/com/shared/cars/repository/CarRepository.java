package com.shared.cars.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shared.cars.domain.Car;
import com.shared.cars.service.SeedService;

@Service
public class CarRepository {
private List<Car> cars = new ArrayList<>(100);
	

	@Autowired
	private SeedService seedService;
	
<<<<<<< HEAD
	public List<Car> findAll () {
		if (cars.size() == 0) {
			cars.addAll(seedService.carCreation());
		}
=======
	
	public CarRepository () {
		super();
		
	}
	
	public List<Car> findAll () {
		System.out.println("johnny: " + seedService);
>>>>>>> bfdea4620a58d68f0a45cd84eeda4fc10edc9f53
		return cars;
	}
}

