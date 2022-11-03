package com.vehicle_industry.car_segment.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vehicle_industry.car_segment.entity.Model;
import com.vehicle_industry.car_segment.repository.ModelRepository;

@Service
public class ModelService 
{
	@Autowired
	private ModelRepository modelRepository;
	
	//Add
	public Model addModel(Model model)
	{
		return modelRepository.save(model);
	}
	//Save
	public Model Save(Model model) 
	{
		return modelRepository.save(model);
	}
	
	//Show
	public Model showModel(int id)
	{
		return modelRepository.findById(id).get();
	}
	
	//Delete
	public String deleteModel(int id)
	{ 
		modelRepository.deleteById(id);
		return "Model Deleted by ID " +id;
	}
	
	//Update
	public Model updateModel(Model model)
	{
		Model br= modelRepository.findById(model.getId()).get();
		br.setName(model.getName());
		br.setYear(model.getYear());
		return modelRepository.save(br);
	}
	
	//showAll
	public List<Model> showAllModel(Model model)
	{
		return modelRepository.findAll();
	}

}
