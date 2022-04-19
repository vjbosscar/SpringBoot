package com.springboot.springbootappln.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.springbootappln.dao.model.Company;
import com.springboot.springbootappln.dao.model.Employee;
import com.springboot.springbootappln.dao.repository.CompanyRepository;
import com.springboot.springbootappln.dao.repository.EmployeeRepository;
import com.springboot.springbootappln.exception.EmptyInputException;

@Service
public class EmpService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee addEmployee(Employee employee) {
		if(employee.getEname().isEmpty() || employee.getEname().length()==0) {
			throw new EmptyInputException("100","Input fields are empty");
			
		}
		return employeeRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee, int id) {
		Employee emp = employeeRepository.getById(id);
		if(emp!=null) {
			emp.setAge(employee.getAge());
			emp.setSal(employee.getSal());
			emp.setEname(employee.getEname());
			emp.setCompany(employee.getCompany());
			return employeeRepository.save(emp);
		}
		return null;
	}
	public Employee deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return null;
	}
	
	public ResponseEntity<Employee> getEmployeeById(int id){
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp!= null) {
			return new ResponseEntity<>(emp.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
//	public List<Employee> listSpecEmp(){
//		employeeRepository.findAll().stream().filter(t -> t.getEname().startsWith("V")).forEach(t -> {t.setSal(t.getSal()+5000);
//		employeeRepository.save(t);
//		});
//		return employeeRepository.findAll();
//	}
//
//
//	public List<Employee> updateSal() {
//		employeeRepository.findAll().stream().filter(t -> !(t.getEname().startsWith("V")) && (t.getAge()>25 && t.getAge()<30)).forEach(t -> {t.setSal(t.getSal()-1000);
//		System.out.println(t);
//		employeeRepository.save(t);
//		});
//		return employeeRepository.findAll();
//	}
	
	public List<Company> getAllCompanies(){
		return companyRepository.findAll();
	}
	
	public ResponseEntity<Company> getCompanyById(int id){
		Optional<Company> comp = companyRepository.findById(id);
		if(comp!= null) {
			return new ResponseEntity<>(comp.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	public List<Company> addCompany(Company comp){
		 companyRepository.save(comp);
		 return companyRepository.findAll();
	}
	
	public Company updateCompany(Company company, int id) {
		Company companyNew = companyRepository.getById(id);
		if(companyNew!=null) {
			companyNew.setCname(company.getCname());
			return companyRepository.save(company);
		}
		return null;
	}
	
	public Company deleteCompany(int id) {
		companyRepository.deleteById(id);
		return null;
	}
	

}
