package com.majustory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {
	
	LoginController(){
		System.out.println("==> LoginController 생성자");
	}
	
	@GetMapping("/loginform")
	private void member(){
	}
}
