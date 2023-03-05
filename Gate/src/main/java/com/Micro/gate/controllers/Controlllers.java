package com.Micro.gate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Micro.gate.entity.GateExam;
import com.Micro.gate.service.Serviceinter;

@RestController
@RequestMapping("/all")
public class Controlllers {
	@Autowired
	private Serviceinter ser;
	
	@GetMapping("/b")
	public ResponseEntity<List<GateExam>> getall(){
		
        List<GateExam> save = ser.red();
		return new ResponseEntity<List<GateExam>>(save,HttpStatus.OK);
		
	}
	
	@GetMapping("/c/{h}")
	public ResponseEntity<GateExam> yetra(@PathVariable("h") Integer GateExam ){
		
		GateExam sar=ser.findbyid();
		return new ResponseEntity<GateExam>(sar,HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/rq")
	public ResponseEntity<GateExam> khas(@RequestBody GateExam r){
		GateExam svd=ser.hach(r);
		return new ResponseEntity<GateExam>(svd,HttpStatus.ACCEPTED);
	}
	
	//@DeleteMapping("/g")
	//public ResponseEntity<GateExam> del(){
		
		
	}


