package com.shared.cars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shared.cars.domain.Car;
import com.shared.cars.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	public CarRepository carRepo;

	public List<Car> findAll() {
		return carRepo.findAll();
	}

	public void save(Car car) {
		
		carRepo.save(car);
	}

	public Car findCarById(Long carId) {
		return carRepo.findCarById(carId);
	}

	public void delete(Long carId) {
		carRepo.deleteById(carId);
	}
	
	
}
