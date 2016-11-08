package com.koena.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String userId, String password) {
		return userId.equalsIgnoreCase("digital@gmail.com") && password.equals("digital");
	}
	

}
