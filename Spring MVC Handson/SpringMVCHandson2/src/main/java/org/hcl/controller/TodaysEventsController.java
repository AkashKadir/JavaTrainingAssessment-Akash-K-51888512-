package org.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/events")
public class TodaysEventsController {
	
	@GetMapping(value="/")
	public String events() {
		return "events";
	}
	
}
