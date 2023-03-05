package com.Micro.VaccinationCenter.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Micro.VaccinationCenter.Entity.VaccinationCenter;
@Repository
public interface CenterRepo extends JpaRepository<VaccinationCenter, Integer>{

}
