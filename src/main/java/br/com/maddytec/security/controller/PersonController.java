package br.com.maddytec.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@RequestMapping("/")
	public String index() {
		return "index page";
	}
	
	
	@RequestMapping("/register")
	public String cadastro() {
		return "page of register";
	}
}
