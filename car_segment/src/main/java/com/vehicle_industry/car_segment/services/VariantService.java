package com.vehicle_industry.car_segment.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vehicle_industry.car_segment.entity.Variant;
import com.vehicle_industry.car_segment.repository.VariantRepository;

@Service
public class VariantService 
{
	@Autowired
	private VariantRepository variantRepository;
	
	//Add
	public Variant addVariant(Variant variant)
	{
		return variantRepository.save(variant);
	}
	//Save
	public Variant Save(Variant variant) 
	{
		return variantRepository.save(variant);
	}
	
	//Show
	public Variant showVariant(int id)
	{
		return variantRepository.findById(id).get();
	}
	
	//Delete
	public String deleteVariant(int id)
	{ 
		variantRepository.deleteById(id);
		return "Variant Deleted by ID " +id;
	}
	
	//Update
	public Variant updateVariant(Variant variant)
	{
		Variant br= variantRepository.findById(variant.getId()).get();
		br.setColor(variant.getColor());
		br.setFueltype(variant.getFueltype());
		br.setTrans(variant.getTrans());
		br.setVtype(variant.getVtype());
		return variantRepository.save(br);
	}
	
	//showAll
	public List<Variant> showAllVariant(Variant variant)
	{
		return variantRepository.findAll();
	}


}
