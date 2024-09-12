package com.majustory.event;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface EventDao {
	public  List<EventVO>  list(EventVO vo);
	public  EventVO  Detail(EventVO vo);
	int totalcount(EventVO vo);
	
	public  void cartInsert(EventVO vo);
	
	public  void cartDel(EventVO vo);
	public  void cartDel2(EventVO vo);
	
	public  List<EventVO> cartlist(EventVO vo);
	
	
}
