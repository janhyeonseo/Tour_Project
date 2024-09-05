package com.majustory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.majustory.event.EventService;
import com.majustory.login.LoginService;
import com.majustory.login.LoginVO;

@RequestMapping("/member")
@Controller
public class MemberController {
	
	@Autowired
	private LoginService service;
	
	MemberController(){
		System.out.println("==> MemberController 생성자");
	}
	
	@GetMapping("/member")
	private void member(Model model){
	}
	
	@PostMapping("/memberOK")
	private String memberOK(Model model, LoginVO vo){
		System.out.println("==> memberOK");
		service.memberInsert(vo);
		return "/index";
	}
	
	
}
