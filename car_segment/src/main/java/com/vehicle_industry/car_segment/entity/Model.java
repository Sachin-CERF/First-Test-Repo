package com.vehicle_industry.car_segment.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Model 
{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int year;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", year=" + year + "]";
	}
	
}
