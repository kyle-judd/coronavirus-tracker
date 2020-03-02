package com.kylejudd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kylejudd.services.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	private CoronaVirusDataService coronaVirusDataService;
	
	@GetMapping("/")
	public String home(Model model) {
		return "home";
	}
}
