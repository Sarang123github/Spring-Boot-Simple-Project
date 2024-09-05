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
		
    		Employee emp2=new Employee("Tushar", "Mumbai");
    		Employee emp3=new Employee("Jay", "Delhi");
    		Employee emp4=new Employee("Shantanu", "Yavatmal");
    		
    		List <Employee> list=new ArrayList<>();
    	
    		list.add(emp2);
    		list.add(emp3);
    		list.add(emp4);
    		
		   bean.saveAllEmp(list);
		
//		           Get Employee By Id
		
		  Employee employByID = bean.getEmployByID(1);
		
		  System.out.println("Id 1 :-"+employByID);
		
//                 Get All Employe
		
		  List<Employee> allEmploye = bean.getAllEmploye();
		
		  System.out.println("All Employe By Id :- "+allEmploye);
		 
//                Delet Employe by ID
		 
		     bean.deletEmpById(1);
		  
//                update by id 
		     
		     bean.updateEmpById(2, "Vishal");
		  
		 
		 
		
		 
       		
	}

}

