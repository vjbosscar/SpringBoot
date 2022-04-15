package com.springboot.springbootappln.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.springbootappln.dao.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	

}
