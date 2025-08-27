package com.daviwolff.workshopmongo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daviwolff.workshopmongo.domain.User;
import com.daviwolff.workshopmongo.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@Autowired
	private UserServices serv;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		List<User> list = serv.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
}