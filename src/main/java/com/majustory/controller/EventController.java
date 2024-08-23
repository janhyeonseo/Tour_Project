package com.majustory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.majustory.event.EventService;
@Controller
public class EventController {

	@Autowired
	private EventService service;

	@GetMapping("/eventList")
	String eventList(Model model) {
		System.out.println("==> eventList ");
		model.addAttribute("li", service.list(null));
		return "/event/eventList";

	}
}
