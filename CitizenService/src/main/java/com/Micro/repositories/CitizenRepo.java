package com.Micro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Micro.entity.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer>{
	
  List<Citizen> findByVaccinationCenterId(Integer Id);
	 

}
