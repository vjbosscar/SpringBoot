package com.springboot.springbootappln.dao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootappln.dao.model.Employee;
import com.springboot.springbootappln.dao.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String userName);
	
}
