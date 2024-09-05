package com.example.demo.servises;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

public interface EmployeeServise {

	//Get 
	public Employee getEmployByID(Integer empId);
	
	//GetAll
	
	public List<Employee> getAllEmploye();
	
	//Save
	public void saveEmp(Employee emp);
	
	//Save All
	
	public void saveAllEmp(List<Employee> empList);
	
	//Update 
	
	public void updateEmpById(Integer empId ,String name );
	
	//Delete
	
	public void deletEmpById(Integer empId);
	
	//Delete All
	
	public void deleteAll();
	
	
	
	
}
