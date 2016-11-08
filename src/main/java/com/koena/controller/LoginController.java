package com.koena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.koena.service.LoginService;
import com.koena.service.ValidationService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private ValidationService validationService;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String showLoginForm(Model model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String verifyLogin(@RequestParam String userId, @RequestParam String password, ModelMap model) {
		Boolean isValidInputs = true;
		if (userId != null && password != null) {
			isValidInputs = validationService.validateInputs(userId, password, model);
		}

		if (isValidInputs) {
			boolean isValidUser = loginService.validateUser(userId, password);
			if (isValidUser) {
				return "searchAccount";
			} else {
				return "login";
			}
		} else {
			return "login";
		}
	}

}
