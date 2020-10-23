package org.hcl.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hcl.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/validate")
public class ValidationController {
	
	@PostMapping(value="/")
	public ModelAndView Validate(HttpServletRequest req, HttpServletResponse res) {
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		if((userName.equals("Adhithya")&&(password.equals("adhithya")))) {
			ModelAndView modelView = new ModelAndView("loggedin");
			Map<String,Object> model = modelView.getModel();
			User user = new User(userName,password);
			model.put("user", user);
			return modelView;
		}
		else {
			ModelAndView modelView = new ModelAndView("login");
			req.setAttribute("error", "Entered username or password was incorrect!");
			return modelView;
		}		
	}
	
}
