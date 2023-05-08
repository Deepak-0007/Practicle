package com.deepakbatch4119.h3.sb.EmployeeB4119SB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepakbatch4119.h3.sb.EmployeeB4119SB.model.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee,Long> {

}
