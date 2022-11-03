package com.vehicle_industry.car_segment.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle_industry.car_segment.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository <Brand,Integer>
{

}
