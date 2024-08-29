package com.majustory.event;

import lombok.Data;

@Data
public class CartVO {
	private int cid;
	private int id;
	private int oid;
	private String ename;
	private int eprice;
	private String eimage;
	private int amount;
}
