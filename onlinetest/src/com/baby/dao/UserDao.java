package com.baby.dao;

import org.apache.ibatis.annotations.Param;

import com.baby.po.User;


public interface UserDao {
	
	public User findUser(@Param("username") String username,
            @Param("password") String password);
	

}
