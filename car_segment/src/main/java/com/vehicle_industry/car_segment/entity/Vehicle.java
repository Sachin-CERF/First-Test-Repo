package com.vehicle_industry.car_segment.entity;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle 
{
	@Id
	@Column
	@GeneratedValue
	private int id;
	private String vehicleName;
	private String vehicleColor;
	private String vehicleType;
	
	
	
	@ManyToMany(mappedBy="vehicle", fetch = FetchType.LAZY)
	private Set<Brand> brand;
	
	
	
	
	public Set<Brand> getBrand() {
		return brand;
	}
	public void setBrand(Set<Brand> brand) {
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleColor() {
		return vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleName=" + vehicleName + ", vehicleColor=" + vehicleColor
				+ ", vehicleType=" + vehicleType + "]";
	}
	
	
	
}
