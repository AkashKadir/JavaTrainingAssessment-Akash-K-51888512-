package org.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/contactUs")
public class ContactController {
	
	@RequestMapping(value="/")
	public String ContactUs() {
		return "contact";
	}
	
}
