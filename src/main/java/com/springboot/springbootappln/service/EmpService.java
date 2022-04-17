package com.springboot.springbootappln.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootappln.dao.model.Company;
import com.springboot.springbootappln.dao.model.Employee;
import com.springboot.springbootappln.dao.repository.CompanyRepository;
import com.springboot.springbootappln.dao.repository.EmployeeRepository;

@Service
public class EmpService {
	@Autowired
	CRUDAppln crudAppln;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee add(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee updateEmployee(int id, Employee employee) {
		
		Employee emp = employeeRepository.getById(id);
		return employeeRepository.save(employee);
	}
	public String delete(int eid) {
		return crudAppln.delete(eid);
	}
	
	public List<Employee> listSpecEmp(){
		employeeRepository.findAll().stream().filter(t -> t.getEname().startsWith("V")).forEach(t -> {t.setSal(t.getSal()+5000);
		employeeRepository.save(t);
		});
		return employeeRepository.findAll();
	}


	public List<Employee> updateSal() {
		employeeRepository.findAll().stream().filter(t -> !(t.getEname().startsWith("V")) && (t.getAge()>25 && t.getAge()<30)).forEach(t -> {t.setSal(t.getSal()-1000);
		System.out.println(t);
		employeeRepository.save(t);
		});
		return employeeRepository.findAll();
	}
	
	public List<Company> getAllComp(){
		return companyRepository.findAll();
	}
	
	public List<Company> saveAllComp(Company comp){
		 companyRepository.save(comp);
		 return companyRepository.findAll();
	}

}
