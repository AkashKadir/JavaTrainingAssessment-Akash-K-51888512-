package org.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
	
	@GetMapping(value="/")
	public String Home() {
		return "home";
	}
	
	@GetMapping(value="/login")
	public String Login() {
		return "login";
	}
	
}
