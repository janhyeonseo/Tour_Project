package com.majustory.login;

import lombok.Data;

@Data
public class LoginVO {
	private String oid;
	private String username;
	private String password;
	private String role;
	private String name;
	private int phone;
	private int age;
	private String gender;
	private String addr1;
	private String addr2;
	private String addr3;
	private String today;

}
