package com.vehicle_industry.car_segment.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vehicle_industry.car_segment.entity.Vehicle;
import com.vehicle_industry.car_segment.repository.VehicleRepository;

@Service
public class VehicleService 
{
	@Autowired
	public VehicleRepository vehicleRepository;
	
		//Add
		public Vehicle addVehicle(Vehicle vehicle)
		{
			return vehicleRepository.save(vehicle);
		}
		//Save
		public Vehicle Save(Vehicle vehicle) 
		{
			return vehicleRepository.save(vehicle);
		}
		
		//Show
		public Vehicle showVehicle(int id)
		{
			return vehicleRepository.findById(id).get();
		}
		
		//Delete
		public String deleteVehicle(int id)
		{ 
			vehicleRepository.deleteById(id);
			return "Vehicle Deleted by ID " +id;
		}
		
		//Update
		public Vehicle updateVehicle(Vehicle vehicle)
		{
			Vehicle br= vehicleRepository.findById(vehicle.getId()).get();
			br.setId(vehicle.getId());
			br.setVehicleColor(vehicle.getVehicleColor());
			br.setVehicleName(vehicle.getVehicleName());
			br.setVehicleType(vehicle.getVehicleType());
			return vehicleRepository.save(br);
		}
		
		//showAll
		public List<Vehicle> showAllVehicle(Vehicle vehicle)
		{
			return vehicleRepository.findAll();
		}

	
}
