package com.codedecode.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repos.EmployeeeCurdRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	
	@Autowired
	private EmployeeeCurdRepo crudRepo;

	@Override
	public Employee addEmployee(Employee employee) {
	
		Employee savedEmployee = crudRepo.save(employee);
		return savedEmployee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return crudRepo.findAll();
	}

	@Override
	public Employee getEmpById(long empidL) {
		 return crudRepo.findById(empidL).get();
		
	}

	@Override
	public void deleteEmpById(long empidL) {
	crudRepo.deleteById(empidL);
		
	}


	

}
