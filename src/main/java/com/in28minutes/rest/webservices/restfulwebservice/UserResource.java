package com.in28minutes.rest.webservices.restfulwebservice;

import java.net.URI;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDao userDao;
	
	@GetMapping("/users")
	public List<User> retrieveAllUser(){
		return userDao.findAll();
	}
	
	@GetMapping("users/{id}")
	 public User retrieveUser(@PathVariable int id){
		User user=userDao.findOne(id);
		
		if (user==null) {
			throw new UserNotFoundException("id-"+id);
		}
	
		return user;
		
		
	}
	@GetMapping("delete/{id}")
	 public void deleteUser(@PathVariable int id){
			
		
		User user=userDao.deleteByIde(id); 
		
		if (user==null) {
			throw new UserNotFoundException("id-"+id);
		}
	
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
	User savedUser=userDao.save(user);
	URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
	return ResponseEntity.created(location).build();
	
	  
	}
	
}
