package com.springboot.springbootappln.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import com.springboot.springbootappln.dao.model.Employee;
import com.springboot.springbootappln.dao.repository.EmployeeRepository;

@Repository
public class CRUDAppln{
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmp() {
	return employeeRepository.findAll();
}
	
	/*public List<Employee> getAll(int cid) {
		// TODO Auto-generated method stub
		List<Employee> empcomp = new ArrayList<Employee>();
		Iterable<Integer> compid = cid;
		employeeRepository.findAllById(compid).foreach(empcomp::add);
		return empcomp;
}*/
	
	
	public String add(Employee emp) {
	employeeRepository.save(emp);
		return "successfully added";
	}

	
	public String update(Employee emp) {
		employeeRepository.save(emp);
		return "successfully updated";
	}

	/*public String update(Employee emp) {
		// TODO Auto-generated method stub
		employee.stream().filter(e -> e.getEid() == emp.getEid()).forEach(e->{
			e.setEname(emp.getEname());
			e.setSal(emp.getSal());
			e.setCid(emp.getCid());
		});
		return "successfully updated";
	}*/

	public String delete(int eid) {
		employeeRepository.deleteById(eid);
		return "deleted";
	}
	/*public String delete(int eid) {
		// TODO Auto-generated method stub
		Iterator<Employee> i = employee.iterator();
		while(i.hasNext())
		{
			Employee e = i.next();
			if(e.getEid() == eid)
			{
			i.remove();	
			}
		}
		return "deleted";
	}*/
}
