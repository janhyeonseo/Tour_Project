package com.majustory.login;

public interface LoginService {
	LoginVO loginUser(LoginVO vo);
	
	void memberInsert(LoginVO vo);
}
