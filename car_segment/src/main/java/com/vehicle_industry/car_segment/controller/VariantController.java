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
import com.vehicle_industry.car_segment.entity.Variant;
import com.vehicle_industry.car_segment.services.VariantService;

@RestController
@RequestMapping("/Variant")
public class VariantController 
{
	public Variant variant;
	
	@Autowired
	private VariantService variantService;
	
	//Creating 
	@PostMapping
	public Variant addVariant(@RequestBody Variant variant)
	{
		return variantService.Save(variant);
	}
	
	@GetMapping(path= "/{id}")
	public Variant showVariant(@PathVariable int id )
	{
		return variantService.showVariant(id);
	}
	
	//ShowAll method
	@GetMapping(path="/all")
	public List<Variant> showAllVariant()
	{
		return variantService.showAllVariant(variant);
	}
	
	//Update
	@PutMapping(path= "/{id}")
	public Variant updateVariant(@RequestBody Variant variant) 
	{
		return variantService.updateVariant(variant);
	}
	
	//Delete
	@DeleteMapping(path= "/{id}")
	public String deleteVariant(@PathVariable int id)
	{
		return variantService.deleteVariant(id);
	}

}
