package com.guglielminijorge.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guglielminijorge.course.entities.User;
import com.guglielminijorge.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService UserService;

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = UserService.findAll();
		return ResponseEntity.ok().body(list);
	}
}
