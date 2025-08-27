package com.daviwolff.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daviwolff.workshopmongo.domain.User;
import com.daviwolff.workshopmongo.dto.UserDTO;
import com.daviwolff.workshopmongo.repository.UserRepository;
import com.daviwolff.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserServices {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User user) {
		return repo.insert(user);
	}
	
	public User fromDTO(UserDTO userDTO) {
		return new User(userDTO.getId(),userDTO.getName(),userDTO.getEmail());
	}
	
	public void delete(String id) {
		repo.deleteById(id);;
	}
	
	public User update(User user) {
		Optional<User> obj = repo.findById(user.getId());
		User newUser = obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); 
		updateData(newUser, user);
		return repo.save(newUser);
	}
	
	public void updateData(User newUser, User oldUser) {
		newUser.setName(oldUser.getName()); 
		newUser.setEmail(oldUser.getEmail()); 
	}
	
}
