package com.aygxy.xlyy.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aygxy.xlyy.user.entity.User;
import com.aygxy.xlyy.user.service.UserService;

@Controller
@RequestMapping("/xlyy/user")
public class UserController {
	@Resource
	UserService userService;
	
	@RequestMapping("/findUserById.action")
	@ResponseBody
	public User findUserById(Model model){
		String id="";
		User user=userService.findUserById(id);
		return user;
	}
}
