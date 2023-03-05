package com.Mtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mtech.entity.Epsm;
import com.Mtech.service.Servicemtech;


@RestController

public class Controllers {
	@Autowired
	private Servicemtech servicemtech;
	
	@GetMapping("/sem")
	public ResponseEntity<List<Epsm>> power(){
	List<Epsm>saveds=servicemtech.power();
	return new ResponseEntity<List<Epsm>>(saveds,HttpStatus.OK);
	}
	@PostMapping("/corona")
	public ResponseEntity<Epsm> signle(@RequestBody Epsm m){
		Epsm savver=servicemtech.signal(m);
		return new ResponseEntity<Epsm>(savver,HttpStatus.CREATED);
	}
	@GetMapping("/sem/{value}")
	public ResponseEntity<Epsm> life(@PathVariable ("value")int naya){
		Epsm savra=servicemtech.life(naya);
		return new ResponseEntity<Epsm>(savra,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/new/{safal}")
	public ResponseEntity<Void> savera(@PathVariable("safal")int kaa){
		servicemtech.saap(kaa);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	@PutMapping("/update")
	public ResponseEntity<Epsm> kalu(@RequestBody Epsm n){
		Epsm saarvd=servicemtech.aam(n);
		return new ResponseEntity<Epsm>(saarvd,HttpStatus.ACCEPTED);
	}

	
	
	
	
	
	


}
