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
	String eventList(Model model, EventVO vo) {
		System.out.println("==> eventList ");
		
		int start = 0;
		int pageSize = 3;
		int pageListSize = 5;
		
		int totalCount = service.totalcount(vo);
		
		if (vo.getStart() ==0) {
			start = 1 ;
		}else {
			start = vo.getStart();
		}
		
		int  end = start + pageSize - 1 ;
		int  totalPage =(int) (Math.ceil((double) totalCount / pageSize));  // 전체페이지 수 
		int  currentPage = (start / pageSize) + 1;  // 현재페이지 
		
		int  lastPage = (totalPage - 1) * pageSize + 1;  // 마지막 페이지
		
	    int  listStartPage = (currentPage - 1) / pageListSize * pageListSize + 1;   // 하단 번호 시작
	    int  listEndPage = listStartPage + pageListSize - 1;   // 하단 번호 끝
		
	    // 1. 페이지 사이즈
	    model.addAttribute("pageSize", pageSize);
	    
	    // 2. 페이지 list 사이즈
	    model.addAttribute("pageListSize", pageListSize);
	    
	    // 3. 전체레코드 수
	    model.addAttribute("totalCount", totalCount);
	    
	    // 4. 총페이지 수
	    model.addAttribute("totalPage", totalPage);
	    
	    // 5. 현재레코드 
	    model.addAttribute("start", start);
	    
	    // 6. 현재 페이지:
	    model.addAttribute("currentPage", currentPage);
	    
	    // 7. 하단 가로 시작:
	    model.addAttribute("listStartPage", listStartPage);
	    
	    // 8. 하단 가로 끝 :
	    model.addAttribute("listEndPage", listEndPage);
	    
	    // 9. 마지막페이지 :
	    model.addAttribute("lastPage", lastPage);
	    
	    vo.setStart(start);
	    vo.setEnd(end);
	    vo.setPageSize(pageSize);
	    
	    model.addAttribute("ch1",vo.getCh1());
	    model.addAttribute("ch2",vo.getCh2());
		model.addAttribute("li", service.list(vo));
		return "event/eventList";

	}
	
	@GetMapping("/eventDetail")
	String eventDetail(Model model, EventVO vo) {
		System.out.println("==> eventDetail ");
		model.addAttribute("m", service.Detail(vo));
		return "event/eventDetail";

	}
}
