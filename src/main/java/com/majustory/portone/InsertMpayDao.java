package com.majustory.portone;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsertMpayDao {
	int InsertMpayService(PortOneVO vo);
}
