package com.daviwolff.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daviwolff.workshopmongo.domain.User;
import com.daviwolff.workshopmongo.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
}
