package com.authservice.service;


import java.time.Instant;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.authservice.entity.AdminDetails;
import com.authservice.model.AdminRegisterRequest;
import com.authservice.repository.AdminDetailsRepo;


@Service
public class AuthService {
	
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	private AdminDetailsRepo adminRep;
	
	
	@Transactional
	public void signUp(AdminRegisterRequest register) {
		AdminDetails admin=new AdminDetails();
		admin.setUserName(register.getUsername());
		admin.setPassword(encoder.encode(register.getPassword()));
		admin.setEmail(register.getEmail());
		admin.setCreatedDate(Instant.now());
		
		
		adminRep.save(admin);
		//String token=generateVerificationToken(admin);
		
	}
	
//	private String generateVerificationToken(AdminRegisterEntity admin) {
//		String token=UUID.randomUUID().toString();
//		VerificationToken vt=new VerificationToken();
//		vt.setToken(token);
//		vt.setAdmin(admin);
//		verifyRep.save(vt);
//		
//		return token;
//	}

}
