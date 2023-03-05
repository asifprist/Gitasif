package com.pathan.repo;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pathan.entity.Khan;

public interface Repo extends JpaRepository<Khan, Integer>{

	

}
