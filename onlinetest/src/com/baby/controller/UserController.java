package com.baby.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baby.po.User;
import com.baby.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	private User user;
	
	@RequestMapping(value="/login")
	public String toLogin(){
		return "login";
	}
	@RequestMapping(value="/check")
	public String toMain(User u, Model model, HttpSession session){
		
		String username = u.getUsername();
		String password = u.getPassword();
		
		user = userService.finduser(username, password);
		
		if(user != null){
			session.setAttribute("USER_SESSION", u);
			return "redirect:main";
		}else{
			model.addAttribute("msg", "用户名或者密码错误");
		}
		
		return "login";
	}
	
	@RequestMapping(value="/main")
	public String toMain(){
		return "main";
	}
	
	
	
	
}
