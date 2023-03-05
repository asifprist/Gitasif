package com.codedecode.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repos.EmployeeeCurdRepo;
import com.codedecode.demo.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/code")
public class EmployeeController {
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmpEntity(@RequestBody Employee employee)
	{
			
		Employee employeeSaved = employeeServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> listofAllEmps = employeeServiceInterface.getAllEmployees().stream().skip(3).collect(Collectors.toList());
		
		return new  ResponseEntity<List<Employee>>(listofAllEmps,HttpStatus.OK);
		
	}
	
	@GetMapping("/emp/{empid}")
	public ResponseEntity<Employee> getAllEmpById(@PathVariable("empid")  long empidL)
	{
		Optional<Employee> empRetrieved= Optional.of(employeeServiceInterface.getEmpById(empidL));
		if(!empRetrieved.isEmpty()) {
		return new  ResponseEntity<Employee>(empRetrieved.get(),HttpStatus.OK);
		}else
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		
	}
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
	{
	Employee	employeeSaved=employeeServiceInterface.addEmployee(employee);
	return new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);
	}
	@DeleteMapping("/delete/{empid}")
	public ResponseEntity<Void> deleteEmpById(@PathVariable("empid")  long empidL)
	{
		employeeServiceInterface.deleteEmpById(empidL);
		
		return new  ResponseEntity<Void>(HttpStatus.ACCEPTED);
		
	}
}


