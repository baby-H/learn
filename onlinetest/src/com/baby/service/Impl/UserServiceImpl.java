package com.baby.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baby.dao.UserDao;
import com.baby.po.User;
import com.baby.service.UserService;


@Service("userService")
/*@Transactional*/
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User finduser(String username, String password) {
		User u = userDao.findUser(username, password);
		return u;
	}

}
