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

import com.vehicle_industry.car_segment.entity.Brand;
import com.vehicle_industry.car_segment.services.BrandService;

@RestController
@RequestMapping("/Brand")
public class BrandController 
{
	public Brand brand;
	
	@Autowired
	private BrandService brandService;

	@PostMapping(path ="/add")
	public List<Brand> saveBrand(@RequestBody Brand brand)
	{
		return brandService.showAllBrand(brand);
	}

	@GetMapping(path= "/{id}")
	public Brand showBrand(@PathVariable int id )
	{
		return brandService.showBrand(id);
	}
	
	//ShowAll method
	@GetMapping(path="/all")
	public List<Brand> showAllBrand()
	{
		return brandService.showAllBrand(brand);
	}
	
	//Update
	@PutMapping(path= "/{id}")
	public Brand updateBrand(@RequestBody Brand brand) 
	{
		return brandService.updateBrand(brand);
	}
	
	//Delete
	@DeleteMapping(path= "/{id}")
	public String deleteBrand(@PathVariable int id)
	{
		return brandService.deleteBrand(id);
	}
	
}