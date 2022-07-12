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
	
	public List<Car> findAll () {
		if (cars.size() == 0) {
			cars.addAll(seedService.carCreation());
		}
		return cars;
	}
}

