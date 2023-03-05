package com.Micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Micro.entity.Citizen;
import com.Micro.repositories.CitizenRepo;

@RestController
@RequestMapping("/map")
public class CitizenController {
	@Autowired
	private CitizenRepo repo;
	
	
	@RequestMapping(path="/test")
	public ResponseEntity<String> test(){
		return new ResponseEntity<String>("hello asif",HttpStatus.OK);
	}
		
		@RequestMapping(path="/id/{id}")
		public ResponseEntity<java.util.List<Citizen>> getById(@PathVariable("id") int id){
			List<Citizen> listCitizen=repo.findByVaccinationCenterId(id);
			return new ResponseEntity<List<Citizen>>(listCitizen,HttpStatus.OK);
	}
		@PostMapping(path="/add")
		public ResponseEntity<Citizen> addcitizen(@RequestBody Citizen c){
		Citizen served=repo.save(c);
		return new ResponseEntity<Citizen>(served,HttpStatus.CREATED);
		}
}
