package com.shared.cars.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.shared.cars.domain.Car;

@Service
public class SeedService {
	
	Map<Long, Car> cars = new LinkedHashMap<>();
	
	public Map<Long, Car> carCreation()  {
		
		Random random = new Random();
		String[] motorSizes = {"Small", "Medium", "Large"};
		String[] modelNames = {"Audi", "Lamborghini", "BMW", "Volkswagen",
							  "Kia", "Honda", "Chevrolet", "Ford", "Lincoln",
							  "LandRover", "Infiniti", "Nissan", "Ram", "Toyota",
							  "Tesla", "Subaru", "Volvo"};
		
		Integer[] wheelSizes = {10,11,12,13,14,15,16,17,18,19,20};
		String[] transmissions = {"automatic", "manual", "hybrid"};
		String[] colors = {"Yellow", "Red", "Blue", "Orange", "Purple", "White", "Black", "Grey"};
		Integer[] years = {2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022};
		BigDecimal[] prices = {new BigDecimal(29845), new BigDecimal(58630), new BigDecimal(75392)};
		
		
		
		
		
		Long i = 1L;
		while (i <= 10) {
			String motorSize = motorSizes[random.nextInt(motorSizes.length - 1)];
			String modelName = modelNames[random.nextInt(modelNames.length - 1)];
			Integer wheelSize = wheelSizes[random.nextInt(wheelSizes.length - 1)];
			String transmission = transmissions[random.nextInt(transmissions.length - 1)];
			String color = colors[random.nextInt(colors.length - 1)];
			Integer year = years[random.nextInt(years.length - 1)];
			BigDecimal price = prices[random.nextInt(prices.length - 1)];
			cars.put(i, new Car(i, motorSize, modelName, wheelSize, transmission, color,
					 year, price));
			i++;
		}
		return cars;
		
		
		
	}
	
	 
	
	
	
}
