package com.authservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authservice.model.AdminRegisterRequest;
import com.authservice.service.AuthService;



@RestController
public class AuthController {
	
	@Autowired
	private AuthService auth;
	@GetMapping("/")
	public String homePage() {
		return "hello world";
	}
	
	@PostMapping("/signup")
	public ResponseEntity<String> registerRequest(@RequestBody AdminRegisterRequest register) {
		auth.signUp(register);
		return new ResponseEntity<>("User Registration Siccessful.\n You can start access your Account",
									HttpStatus.OK);
	}

}

