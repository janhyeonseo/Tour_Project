package com.majustory.event;

import java.util.List;

public interface EventService {
	public  List<EventVO>  list(EventVO vo);
	public  EventVO  Detail(EventVO vo);
	public int totalcount(EventVO vo);
}
