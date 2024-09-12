package com.majustory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.majustory.login.LoginService;
import com.majustory.login.LoginVO;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/loginT")
@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	LoginController(){
		System.out.println("==> LoginController 생성자");
	}
	
	
	/*
	@PostMapping("/loginOK")
	private String loginOK(Model model, LoginVO vo) {
		System.out.println("===> loginOK 매핑확인 " + vo.getUsername() + ":" + vo.getPassword());

		LoginVO m = service.loginUser(vo);
		System.out.println("아이디 존재 확인 ==> " + m.getUsername());

		if (m != null) {
			if(m.getPassword().equals(vo.getPassword())) {
				System.out.println("로그인 성공");
				return "redirect:/login/success";
			} else {
				System.out.println("로그인 실패");
				return "redirect:/login/fail";
			}
			
		} else {
			System.out.println("로그인 실패");
			return "redirect:/login/fail";
		}
	}
 */
	
	
	@GetMapping("/loginform")
	private String loginform() {
		System.out.println("===> loginform 매핑확인 ");

		return "login/loginform.html";
	}

	
	
	@GetMapping("/logout")
	private String logout(Model model, HttpSession session) {
		System.out.println("===> logout 매핑확인 ");
		session.invalidate();
		return "login/logout.html";
	}

	@GetMapping("/fail")
	private String fail() {
		System.out.println("===> fail 매핑확인 ");

		return "login/fail.html";
	}

	@GetMapping("/success")
	private String loginSuccess() {
		System.out.println("===> loginSuccess 매핑확인 ");

		return "login/success.html";
	}
	
	@GetMapping("/accessDenied")	
	private String accessDenied( Model  model   ) {
		System.out.println("===>accessDenied ");
		
		return "login/accessDenied.html"; 		 				
	}
}
