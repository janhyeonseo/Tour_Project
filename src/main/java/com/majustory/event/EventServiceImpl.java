package com.majustory.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventDao  dao;
	
	EventServiceImpl(){
		System.out.println("==> EventServiceImpl");
	}

	@Override
	public List<EventVO> list(EventVO vo) {
		// TODO Auto-generated method stub
		return dao.list(vo);
	}
}
