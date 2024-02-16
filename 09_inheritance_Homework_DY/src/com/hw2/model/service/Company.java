package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {

	private Employee[] employees;
	private int employeeCount;
	
	
	
	
   
	
	public Employee[] getEmployees() {
		return employees;
	}



	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}



	public int getEmployeeCount() {
		return employeeCount;
	}



	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}



	public Company(int size) {}
	
	
	
	@Override
	public void addPerson(Person person) {
		
	}

	@Override
	public void removePerson(String id) {
	
	}

	@Override
	public void displayAllPerson() {
		
		
	}

	
}
