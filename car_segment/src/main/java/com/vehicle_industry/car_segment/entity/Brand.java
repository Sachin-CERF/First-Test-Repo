package com.vehicle_industry.car_segment.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Brand 
{
	@Id
	@GeneratedValue
	@Column
	private int id;
	private String vehiclebrand;
	
	
	@ManyToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL)
	//Create New Table for join mapping
	@JoinTable (name= "Brand_And_Vehicle",
			joinColumns = { @JoinColumn (name="brand_id", referencedColumnName="id ")},
			inverseJoinColumns = {@JoinColumn(name="vehicle_id", referencedColumnName="id")}
			
			)
	
	private Set<Vehicle> vehicle; 
	


	public Set<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehiclebrand() {
		return vehiclebrand;
	}

	public void setVehiclebrand(String vehiclebrand) {
		this.vehiclebrand = vehiclebrand;
	}


	@Override
	public String toString() {
		return "Brand [id=" + id + ", vehiclebrand=" + vehiclebrand  + "]";
	}
	
}
