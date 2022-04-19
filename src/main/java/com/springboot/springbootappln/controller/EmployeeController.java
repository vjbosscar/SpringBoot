package com.springboot.springbootappln.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootappln.dao.model.Company;
import com.springboot.springbootappln.dao.model.Employee;
import com.springboot.springbootappln.service.EmpService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/getEmployees")
	public List<Employee> getAllEmp(){
		return empService.getAllEmployees();
	}
	
	@PostMapping("/addEmployee")
	public Employee add(@RequestBody Employee employee){
		return empService.addEmployee(employee);	
	}
	
	@PutMapping("/employee/update/{id}")
	public Employee update(@RequestBody Employee employee, @PathVariable int id){
		return empService.updateEmployee(employee, id);	
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String delete(@PathVariable int id){
		empService.deleteEmployee(id);	
		return null;
	}
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
		return empService.getEmployeeById(id);	
	}
	
//	@GetMapping("/updateSal")
//	public List<Employee> updateSal(){
//		return empService.updateSal();	
//	}
	
	
}
