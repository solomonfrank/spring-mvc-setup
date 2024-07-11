package com.solomonfrank.springcore_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

	
	@GetMapping("/home")
	public String getHome() {
		return "student";
	}

}
