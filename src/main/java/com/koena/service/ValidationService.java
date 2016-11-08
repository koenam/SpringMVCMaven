package com.koena.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class ValidationService {

	Pattern pattern;
	Matcher matcher;
	final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	String STRING_PATTERN = "[A-Z]+";

	public boolean validateInputs(String userId, String password, ModelMap model) {

		Boolean isValid = true;
		if (password.length() < 6) {
			model.addAttribute("loginError", "password is min 6 characters");
			isValid = false;
		}

		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(userId);
		if (!matcher.matches()) {
			model.addAttribute("loginError", "Enter a correct email");
			isValid = false;
		}
		return isValid;
	}
	
	public boolean validateAccountNumber(String accountNumber, ModelMap model){
		Boolean isValid = true;
		if(accountNumber.length() < 8 || accountNumber.length() > 50){
			model.addAttribute("accountError", "account number can only be min 8 characters and max 50 characters");
			isValid = false;
		}
		
		pattern = Pattern.compile(STRING_PATTERN);
		matcher = pattern.matcher(accountNumber.substring(0, 1));
		if (!matcher.matches()) {
			model.addAttribute("accountError", "Account number must start with a letter");
			isValid = false;
		}
		return isValid;
	}

}
