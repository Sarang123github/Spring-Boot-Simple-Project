package com.example.demo.servises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeSerivseImpl implements EmployeeServise {

	// @Autowired
	private final EmployeeRepo employeeRepo;           //Final aslya mule null use kelay and "final" aslya mule autowired nahi karata yenar 
	                                                  // nahi tr diract varibale var Autowired annotion use kel asat 
	
	
//	@Autowired :- Tas tar ithe @AutoWireda annotation use karan compoulsary asat pan ithe ekcha constructor asalya mule nahi kel tri cchalel
	public EmployeeSerivseImpl (EmployeeRepo employeeRepo) {
		 this.employeeRepo=employeeRepo;
	}
	
	@Override
	public Employee getEmployByID(Integer empId) {
		Employee employeeID = employeeRepo.findById(empId).orElse(null);
		
		return employeeID;
//		if (employeeID!=null) {
//			
//			return employeeID;
//		}
//		else {
//			System.out.println("Employe id is null");
//		}
	}

	@Override
	public List<Employee> getAllEmploye() {
		
		Iterable<Employee> empItr = employeeRepo.findAll();
		
		List<Employee> emplist=new ArrayList<>();
		
	//	empItr.forEach(x->emplist.add(x));     using  Arrow Function
		
		for(Employee i:empItr) {
			
			emplist.add(i);
			
		}
		return emplist;
	}

	@Override
	public void saveEmp(Employee emp) {
		
		employeeRepo.save(emp);
		
	}

	@Override
	public void saveAllEmp(List<Employee> empList) {
	
		employeeRepo.saveAll(empList);
		
	}

	@Override
	public void updateEmpById(Integer empId ,String name) {
	
		Employee empbyId = employeeRepo.findById(empId).orElse(null);
		empbyId.setName(name);
		employeeRepo.save(empbyId);
	}

	@Override
	public void deletEmpById(Integer empId) {
		
		employeeRepo.deleteById(empId);
		
	}

	@Override
	public void deleteAll() {
		
		employeeRepo.deleteAll();
		
	}

}
