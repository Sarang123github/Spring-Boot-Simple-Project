package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id                                                       // @Id ha table chya primarkey asato
	@GeneratedValue(strategy  = GenerationType.IDENTITY)     // GenerateValue madhe Identity use kelua mule value auto geneate hote
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String city;
	
	public Employee() {
		
	}
	
	public Employee(String name, String city) {
		super();	
		this.name = name;
		this.city = city;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	

	
	

}
