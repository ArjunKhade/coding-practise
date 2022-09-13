package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
	  //add user authentication method : finder method
       Optional<User>findByEmailAndPassword(String email,String pass);
       //finder method to find user by email
       Optional<User> findByEmail(String email);
}
