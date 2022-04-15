package com.springboot.springbootappln.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp(){
		return empService.getAllEmp();
	}
	
	@PostMapping("/addEmp")
	public String add(@RequestBody Employee emp){
		return empService.add(emp);	
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Employee emp){
		return empService.update(emp);	
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int eid){
		return empService.delete(eid);	
	}
	
	@GetMapping("/listSpecEmp")
	public List<Employee> listSpecEmp(){
		return empService.listSpecEmp();	
	}
	
	@GetMapping("/updateSal")
	public List<Employee> updateSal(){
		return empService.updateSal();	
	}
	
	@GetMapping("/getAllComp")
	public List<Company> getAllComp(){
		return empService.getAllComp();	
	}
	
	@PostMapping("/saveAllComp")
	public List<Company> saveAllComp(@RequestBody Company comp){
		return empService.saveAllComp(comp);	
	}
	
	
}
