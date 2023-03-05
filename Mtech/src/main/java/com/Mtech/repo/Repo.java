package com.Mtech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mtech.entity.Epsm;
@Repository
public interface Repo extends JpaRepository<Epsm, Integer>{

}
