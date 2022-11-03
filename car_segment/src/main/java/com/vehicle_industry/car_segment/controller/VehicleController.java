package com.vehicle_industry.car_segment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle_industry.car_segment.entity.Vehicle;
import com.vehicle_industry.car_segment.services.VehicleService;

@RestController
@RequestMapping("/Vehicle")
public class VehicleController 
{
	public Vehicle vehicle;
	
	@Autowired
	VehicleService vehicleService;
	
	//Creating 
		@PostMapping(path ="/add")
		public Vehicle addVehicle(@RequestBody Vehicle vehicle)
		{
			return vehicleService.Save(vehicle);
		}
		
		public Vehicle getVehicle() {
			return vehicle;
		}

		public void setVehicle(Vehicle vehicle) {
			this.vehicle = vehicle;
		}

		public VehicleService getVehicleService() {
			return vehicleService;
		}

		public void setVehicleService(VehicleService vehicleService) {
			this.vehicleService = vehicleService;
		}

		@GetMapping(path= "/{id}")
		public Vehicle showVehicle(@PathVariable int id )
		{
			return vehicleService.showVehicle(id);
		}
		
		//ShowAll method
		@GetMapping(path="/all")
		public List<Vehicle> showAllVehicle()
		{
			return vehicleService.showAllVehicle(vehicle);
		}
		
		//Update
		@PutMapping(path= "/{id}")
		public Vehicle updateVehicle(@RequestBody Vehicle vehicle) 
		{
			return vehicleService.updateVehicle(vehicle);
		}
		
		//Delete
		@DeleteMapping(path= "/{id}")
		public String deleteVehicle(@PathVariable int id)
		{
			return vehicleService.deleteVehicle(id);
		}

}
