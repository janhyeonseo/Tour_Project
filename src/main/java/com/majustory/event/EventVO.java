package com.majustory.event;

import lombok.Data;

@Data
public class EventVO {
	private int id;
	private String ename;
	private String status;
	private String etc;
	private String address;
	private String detailaddress;
	private String eday;
	private String enotion;
	private String eimage;
	private String homepage;
	private String price;
	
	
	private int rownum;
	private int rnum;
	
	private int pageSize;
	private int start;
	private int end;
	
	private String ch1;
	private String ch2;
	
	
	private int cid;
	private int oid;
	private int eprice;
	private int amount;
}
