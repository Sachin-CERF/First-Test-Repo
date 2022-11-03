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

import com.vehicle_industry.car_segment.entity.Model;
import com.vehicle_industry.car_segment.services.ModelService;

@RestController
@RequestMapping("/Model")
public class ModelController 
{
	public Model model;
	
	@Autowired
	private ModelService modelService;
	
	//Creating 
	@PostMapping
	public Model addModel(@RequestBody Model model)
	{
		return modelService.Save(model);
	}
	
	@GetMapping(path= "/{id}")
	public Model showModel(@PathVariable int id )
	{
		return modelService.showModel(id);
	}
	
	//ShowAll method
	@GetMapping(path="/all")
	public List<Model> showAllModel()
	{
		return modelService.showAllModel(model);
	}
	
	//Update
	@PutMapping(path= "/{id}")
	public Model updateModel(@RequestBody Model model) 
	{
		return modelService.updateModel(model);
	}
	
	//Delete
	@DeleteMapping(path= "/{id}")
	public String deleteModel(@PathVariable int id)
	{
		return modelService.deleteModel(id);
	}

}
