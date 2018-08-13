package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service; 
import com.service.UserService;
import com.dao.UserMapper;
import com.entity.User;

@Service("userService")
public class ServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	
	public User selectByE(String name) {
		return this.userMapper.selectByE(name);
	}

}
