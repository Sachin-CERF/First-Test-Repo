package com.vehicle_industry.car_segment.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vehicle_industry.car_segment.entity.Variant;

public interface VariantRepository extends JpaRepository<Variant, Integer> 
{

}
