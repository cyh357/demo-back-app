package com.example.demo.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.dto.UserDto;
import com.example.demo.user.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/idCheck/{userId}")
	public Boolean idCheck(@PathVariable String userId) {
		System.out.println("Controller에서 받은 ID: " + userId);
		return userService.idCheck(userId);
	};
	
	@PostMapping("/register")
	public int createUser(@RequestBody UserDto userDto) {
		return userService.createUser(userDto);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Boolean> login(@RequestBody UserDto userDto) {
		boolean result = userService.login(userDto);
		return ResponseEntity.ok(result);
	}
}
