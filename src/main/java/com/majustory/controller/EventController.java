package com.majustory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.majustory.event.EventService;
import com.majustory.event.EventVO;

@RequestMapping("/event")
@Controller
public class EventController {

	@Autowired
	private EventService service;

	@GetMapping("/eventList")
	String eventList(Model model) {
		System.out.println("==> eventList ");
		model.addAttribute("li", service.list(null));
		return "event/eventList";

	}
	
	@GetMapping("/eventDetail")
	String eventDetail(Model model, EventVO vo) {
		System.out.println("==> eventDetail ");
		model.addAttribute("m", service.Detail(vo));
		return "event/eventDetail";

	}
}
