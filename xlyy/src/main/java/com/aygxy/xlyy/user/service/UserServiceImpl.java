package com.aygxy.xlyy.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aygxy.xlyy.user.dao.UserMapper;
import com.aygxy.xlyy.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserMapper userMapper;
	@Override
	public User findUserById(String id) {
		User user=userMapper.findUserById(id);
		return user;
	}
	
}
