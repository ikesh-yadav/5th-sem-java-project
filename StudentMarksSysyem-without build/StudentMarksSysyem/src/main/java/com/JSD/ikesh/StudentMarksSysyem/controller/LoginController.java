
package com.JSD.ikesh.StudentMarksSysyem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
class LoginController{
	
	@RequestMapping(value="/login", method= RequestMethod.GET )
	public String showLoginMessage() {
		return "login";
	}
	
}