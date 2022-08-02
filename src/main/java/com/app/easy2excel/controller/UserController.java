package com.app.easy2excel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.easy2excel.dto.UserDTO;
import com.app.easy2excel.entity.User;
import com.app.easy2excel.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody UserDTO userDTO) {
		return ResponseEntity.ok(userService.saveUser(userDTO));
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
		return ResponseEntity.ok(userService.getUserById(id));
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> getUsers() {
		return ResponseEntity.ok(userService.getUserList());
	}

}
