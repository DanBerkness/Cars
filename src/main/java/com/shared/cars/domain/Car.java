package com.shared.cars.domain;

import java.math.BigDecimal;

//Motor size varchar ID Primary Key.null.int Model name varchar Wheel size int 
//Transmission type varchar Color varchar Year int Price decimal
public class Car {

	private Long id;
	private String motorSize;
	private String modelName;
	private Integer wheelSize;
	private String transmission;
	private String color;
	private Integer year;
	private BigDecimal price;
	
	public Car() {};
	
	public Car(Long id, String motorSize, String modelName, Integer wheelSize, String transmission, String color,
			Integer year, BigDecimal price) {
		super();
		this.id = id;
		this.motorSize = motorSize;
		this.modelName = modelName;
		this.wheelSize = wheelSize;
		this.transmission = transmission;
		this.color = color;
		this.year = year;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", motorSize=" + motorSize + ", modelName=" + modelName + ", wheelSize=" + wheelSize
				+ ", transmission=" + transmission + ", color=" + color + ", year=" + year + ", price=" + price + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMotorSize() {
		return motorSize;
	}
	public void setMotorSize(String motorSize) {
		this.motorSize = motorSize;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Integer getWheelSize() {
		return wheelSize;
	}
	public void setWheelSize(Integer wheelSize) {
		this.wheelSize = wheelSize;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
