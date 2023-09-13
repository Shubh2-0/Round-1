package com.masai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{

	
	public Optional<User> findByEmail(String email);
	
	
}
