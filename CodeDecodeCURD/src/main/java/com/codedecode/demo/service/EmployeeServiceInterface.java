package com.codedecode.demo.service;

import java.util.List;

import com.codedecode.demo.entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

    

	Employee getEmpById(long empidL);

	 void deleteEmpById(long empidL);

}
