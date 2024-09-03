package com.majustory.login;

import lombok.Data;

@Data
public class LoginVO {
	private String oid;
	private String username;
	private String password;
	private String role;
	private String name;
	private String today;

}
