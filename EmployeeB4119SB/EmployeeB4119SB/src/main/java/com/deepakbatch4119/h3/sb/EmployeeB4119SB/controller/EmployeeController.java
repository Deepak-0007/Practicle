package com.deepakbatch4119.h3.sb.EmployeeB4119SB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepakbatch4119.h3.sb.EmployeeB4119SB.model.Employee;
import com.deepakbatch4119.h3.sb.EmployeeB4119SB.repository.Employeerepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	Employeerepository em;
	@RequestMapping("/details")
	public List<Employee> getEmployee(){
		return em.findAll();
		
	}

}
