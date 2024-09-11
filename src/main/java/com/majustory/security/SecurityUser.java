package com.majustory.security;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.majustory.login.LoginVO;


public class SecurityUser extends User {

	private static final long serialVersionUID = 1L;
	
    // "{noop}" : 평문사용시 이용
	public SecurityUser( LoginVO vo ) {
		super(vo.getUsername(), 
				"{noop}" + vo.getPassword(), 
			  AuthorityUtils.createAuthorityList(vo.getRole().toString()));
  	}	

}
