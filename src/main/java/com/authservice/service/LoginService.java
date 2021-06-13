package com.authservice.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.authservice.AdminPrincipal;
import com.authservice.entity.AdminDetails;
import com.authservice.repository.AdminDetailsRepo;

@Service
public class LoginService implements UserDetailsService{
	
	private AdminDetailsRepo adminRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AdminDetails admin=adminRepo.findByUserName(username);;
		
		System.out.println("iugih"+admin.getUserName());
		return new AdminPrincipal(admin);
	}

}
