package com.deepakbatch4119.h3.sb.EmployeeB4119SB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.deepakbatch4119.h3.sb.EmployeeB4119SB.model.Employee;
import com.deepakbatch4119.h3.sb.EmployeeB4119SB.repository.Employeerepository;

@SpringBootApplication
public class EmployeeB4119SbApplication implements CommandLineRunner {
	@Autowired
	Employeerepository em;
	public static void main(String[] args) {
	
		
		SpringApplication.run(EmployeeB4119SbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	em.save(new Employee("Deepak Yadav","Delhi"));
	em.save(new Employee("Harinder Yadav","Haryana"));
	}
	

}
