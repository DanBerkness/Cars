package com.shared.cars.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shared.cars.domain.Car;
import com.shared.cars.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	public CarRepository carRepo;

	public Map<Long, Car> findAll() {
		return carRepo.findAll();
	}

	public void save(Car car) {
		
		carRepo.save(car);
	}

	public Car findCarById(Long carId) {
		return carRepo.findCarById(carId);
	}

	public void delete(Car car) {
		carRepo.delete(car);
	}
	
	
}
