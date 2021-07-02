package com.example.demo.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyController {

	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
}
