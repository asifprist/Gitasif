package com.Micro.gate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Micro.gate.entity.GateExam;

import repo.Repo;

@Service
public class Services implements Serviceinter{
	@Autowired
	private Repo repo;

	@Override
	public List<GateExam> red() {
		return repo.findAll();
		
	}

	@Override
	public GateExam findbyid() {
		GateExam g=(GateExam) repo.findAll();
		return g;
	}

	@Override
	public GateExam hach(GateExam r) {
		GateExam n=repo.save(r);
		return n;
	}
	
	

}
