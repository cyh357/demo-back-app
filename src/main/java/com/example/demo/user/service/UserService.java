package com.example.demo.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.dto.UserDto;
import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.vo.UserVo;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public Boolean idCheck(String userId) {
		return userMapper.selectIdCheck(userId) == 1;
	}

	public int createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(new UserVo(userDto));
	}

	public Boolean login(UserDto userDto) {
		// TODO Auto-generated method stub
		Boolean b = userMapper.selectLogin(new UserVo(userDto)) == 1;
		System.out.println(b);
		return userMapper.selectLogin(new UserVo(userDto)) == 1;
	}

}
