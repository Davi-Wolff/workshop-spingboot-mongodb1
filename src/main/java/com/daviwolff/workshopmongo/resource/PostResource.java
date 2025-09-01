package com.daviwolff.workshopmongo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daviwolff.workshopmongo.domain.Post;
import com.daviwolff.workshopmongo.domain.User;
import com.daviwolff.workshopmongo.dto.UserDTO;
import com.daviwolff.workshopmongo.services.PostServices;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {
	
	
	@Autowired
	private PostServices serv;
	
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post post = serv.findById(id);
		return ResponseEntity.ok().body(post);
	}
}