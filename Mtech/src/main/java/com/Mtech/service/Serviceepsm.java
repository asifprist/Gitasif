package com.Mtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mtech.entity.Epsm;
import com.Mtech.repo.Repo;

@Service
public class Serviceepsm implements Servicemtech {
	@Autowired
	private Repo repo;

	@Override
	public List<Epsm> power() {
		return repo.findAll();	
	}
	@Override
	public Epsm signal(Epsm m) {
		Epsm l=repo.save(m);
		return l;
	}

	@Override
	public Epsm life(int naya) {
		repo.findById(naya).get();
		return null;
	}
	@Override
	public void saap(int kaa) {
	repo.deleteById(kaa);	
	}
	@Override
	public Epsm aam(Epsm n) {
		Epsm r=repo.save(n);
		return r;
	}

	

	}


