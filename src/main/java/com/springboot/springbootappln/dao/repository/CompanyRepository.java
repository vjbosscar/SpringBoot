package com.springboot.springbootappln.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootappln.dao.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
