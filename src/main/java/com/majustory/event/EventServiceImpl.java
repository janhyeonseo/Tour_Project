package com.majustory.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EventServiceImpl implements EventService {
	
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

	@Override
	public EventVO Detail(EventVO vo) {
		// TODO Auto-generated method stub
		return dao.Detail(vo);
	}

	@Override
	public int totalcount(EventVO vo) {
		// TODO Auto-generated method stub
		return dao.totalcount(vo);
	}

	@Override
	public void cartInsert(CartVO vo) {
		// TODO Auto-generated method stub
		dao.cartInsert(vo);
	}
}
