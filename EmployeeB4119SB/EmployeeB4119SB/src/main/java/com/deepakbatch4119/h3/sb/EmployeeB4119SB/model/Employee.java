package com.deepakbatch4119.h3.sb.EmployeeB4119SB.model;

import jakarta.persistence.*;

@Entity
@Table(name="Emp_info")

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Emp_id")
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Employee() {
		
	}

}
