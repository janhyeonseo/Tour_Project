package com.majustory.event;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EventDao {
	public  List<EventVO>  list(EventVO vo);
	public  EventVO  Detail(EventVO vo);
}
