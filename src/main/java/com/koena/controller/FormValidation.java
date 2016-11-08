package com.koena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FormValidation implements Validator {
	
	@Autowired
	private User user;

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		User user = (User) target;
		
		   if (user.getPassword().toString().length() < 6) {
		    errors.rejectValue("passwordLength", "passwordLength.min",
		      "Password should not less than 6 characters");
		   }

	}

}
