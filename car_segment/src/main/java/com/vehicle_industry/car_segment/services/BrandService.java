package com.vehicle_industry.car_segment.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.vehicle_industry.car_segment.entity.Brand;
import com.vehicle_industry.car_segment.repository.BrandRepository;

@Service
public class BrandService 
{
	@Autowired
	private BrandRepository brandRepository;
	
	//Create
	public Brand addBrand(Brand brand)
	{
		return brandRepository.save(brand);
	}
	
	//Save
	public Brand saveBrand(Brand brand)
	{
		return brandRepository.save(brand);
	}
	
	//Show
	public Brand showBrand(int id)
	{
		return brandRepository.findById(id).get();
	}
	
	
	//delete
	public String deleteBrand(int id)
	{ 
		brandRepository.deleteById(id);
		return "Brand Deleted by ID " +id;
		
	}
	
	//update
	public Brand updateBrand(Brand brand)
	{
		Brand br= brandRepository.findById(brand.getId()).get();
		br.setId(brand.getId());
		br.setVehiclebrand(brand.getVehiclebrand());
		return brandRepository.save(br);
	}
	
	//showAll
	public List<Brand> showAllBrand(Brand brand)
	{
		return brandRepository.findAll();
	}
	
}
