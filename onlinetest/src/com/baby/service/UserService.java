package com.baby.service;

import com.baby.po.User;


public interface UserService {
	
	public User finduser(String username, String password);

}
