package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employee;
import com.example.demo.servises.EmployeeSerivseImpl;



@SpringBootApplication
public class SpringRepo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringRepo1Application.class, args);
		
		EmployeeSerivseImpl bean = context.getBean(EmployeeSerivseImpl.class);
		
//	              Save Employee
				
    		Employee emp=new Employee("Yash", "Pune");
    		
//                 Save All    		
		
    		
    		List<Employee> emps = List.of(new Employee("Sarang", "Yavatmal"),new Employee("Sagar", "Nagpur"),new Employee("Tushar", "Pune"));
		   bean.saveAllEmp(emps);
		
		
//		           Get Employee By Id
		
		  Employee employByID = bean.getEmployByID(1);
		
		  System.out.println("Id 1 :-"+employByID);
		
//                 Get All Employe
		
		  List<Employee> allEmploye = bean.getAllEmploye();
		
		  System.out.println("All Employe By Id :- "+allEmploye);
		 
//                Delet Employe by ID
		 
//		     bean.deletEmpById(1);
		  
//                update by id 
		     
		     bean.updateEmpById(10, "Vishal");
		  
		 
		 
		
		 
       		
	}

}

