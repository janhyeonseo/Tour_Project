package com.majustory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {
	
	
	StartController(){
		System.out.println("==> StartController 생성자");
	}
	
	@GetMapping("/index")
	private void index(Model model){
		model.addAttribute("Hello","시작페이지");
	}
	
	
}
