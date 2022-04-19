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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootappln.dao.model.Company;
import com.springboot.springbootappln.dao.model.Employee;
import com.springboot.springbootappln.service.EmpService;

@RestController
public class CompanyController {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/getCompanies")
	public List<Company> getAllCompanies(){
		return empService.getAllCompanies();	
	}
	
	@GetMapping("/getCompany/{id}")
	public ResponseEntity<Company> getCompanyById(@PathVariable int id){
		return empService.getCompanyById(id);	
	}
	
	@PostMapping("/addCompany")
	public List<Company> addCompany(@RequestBody Company comp){
		return empService.addCompany(comp);	
	}
	
	@PutMapping("/company/update/{id}")
	public Company update(@RequestBody Company company, @PathVariable int id){
		return empService.updateCompany(company, id);	
	}
	
	@DeleteMapping("/deleteCompany/{id}")
	public String delete(@PathVariable int id){
		empService.deleteCompany(id);	
		return null;
	}

}
