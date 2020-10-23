package org.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/contactUs")
public class ContactController {
	@GetMapping(value="/")
	public String ContactUs() {
		return "contact";
	}
}
