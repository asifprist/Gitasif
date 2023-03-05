package com.pathan.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pathan.entity.Khan;
import com.pathan.service.ServiceInterface;

@RestController
public class Controller {
	@Autowired
	private ServiceInterface serviceInterface;
	
//	@GetMapping("/srk")
//	public ResponseEntity<List<Khan>> getAllKhan(){
//	List<Khan>	saved=serviceInterface.getAllKhan();
//		return new ResponseEntity<List<Khan>>(saved,HttpStatus.OK);
//	}
	
	
	@GetMapping("/srk")
	
	public ResponseEntity<String> getall(){
		List<String> unqname=serviceInterface.getAllKhan().stream().map(emp->emp.getName()).collect(Collectors.toList());
		Set<Khan> unkname=new HashSet<>();
		//Set<String> duplicatename=unqname.stream().filter(Khan->!unkname.addAll(Khan)).collect(Collectors.toSet());
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
	
	
	
	
	@PostMapping("/save")
	public ResponseEntity<Khan> aam(@RequestBody Khan k)
	{
		Khan savd=serviceInterface.imli(k);
		return new ResponseEntity<Khan>(savd,HttpStatus.CREATED);
	}

	@GetMapping("/ak/{abram}")
	public ResponseEntity<Khan> getkhan(@PathVariable ("abram")int radhe){
		Khan savds=serviceInterface.serogecy(radhe);
		return new ResponseEntity<Khan>(savds,HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("/mitao/{isko}")
	public ResponseEntity<Void> deletekrdo(@PathVariable ("isko") int munna){
		serviceInterface.kalu(munna);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	@PutMapping("/update")
	public ResponseEntity<Khan> kohli(@RequestBody Khan u)
	{
		Khan svved=serviceInterface.balu(u);
		return new ResponseEntity<Khan>(svved,HttpStatus.ACCEPTED);
	}
	

}
