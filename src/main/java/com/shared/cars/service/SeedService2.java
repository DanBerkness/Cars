package com.shared.cars.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.shared.cars.domain.Car;

@Service
public class SeedService2 {
	public static void main(String[] args) throws FileNotFoundException {
		
		CarCreation();
		

	}
	
	private static void CarCreation() throws FileNotFoundException {
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
		
		
		int numberOfMotorSizes = 2;
		int numberOfModelNames = 16;
		int numberOfWheelSize = 9;
		int numberOfTransmissions = 2;
		int numberOfColors = 8;
		int numberOfYears = 6;
		
		
		
		
		int i = 1;
		while (i <= 10) {
			String motorSize = motorSizes[random.nextInt(numberOfMotorSizes)];
			String modelName = modelNames[random.nextInt(numberOfModelNames)];
			Integer wheelSize = wheelSizes[random.nextInt(numberOfWheelSize)];
			String transmission = transmissions[random.nextInt(numberOfTransmissions)];
			String color = colors[random.nextInt(numberOfColors)];
			Integer year = years[random.nextInt(numberOfYears)];
			
			System.out.println("Car: " + i +"\nMotor Size: " + motorSize +"\nModel Name: " + 
								modelName + "\nWheel Size: " + wheelSize + 
								"\nTransmission: " + transmission + "\nColor: " + 
								color + "\nYear: " + year + "\n");
			
			i++;
			
		}
		
		
		
	}
	
	 
	
	
	
}
