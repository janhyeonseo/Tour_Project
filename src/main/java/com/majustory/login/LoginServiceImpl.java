package com.majustory.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDao dao;

	@Override
	public LoginVO loginUser(LoginVO vo) {
		// TODO Auto-generated method stub
		return dao.loginUser(vo);
	}

}
