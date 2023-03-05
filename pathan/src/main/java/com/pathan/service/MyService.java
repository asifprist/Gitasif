package com.pathan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathan.entity.Khan;
import com.pathan.repo.Repo;

@Service
public class MyService implements ServiceInterface{
	@Autowired
	private Repo repo;

	@Override
	public List<Khan> getAllKhan() {
		   
	return repo.findAll();
		
	}

	@Override
	public Khan imli(Khan k) {
		Khan s=repo.save(k);
		return s;
	}

	@Override
	public Khan serogecy(int radhe) {
		Khan t=repo.findById(radhe).get();
		return t;
	}

	@Override
	public void kalu(int munna) {
		
	repo.deleteById(munna);
	
	}

	@Override
	public Khan balu(Khan u) {
		Khan n=repo.save(u);
		return n;
	}

}
