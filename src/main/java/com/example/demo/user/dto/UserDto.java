package com.example.demo.user.dto;

import com.example.demo.board.dto.BoardDto;
import com.example.demo.user.vo.UserVo;

public class UserDto {
	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDto() {}
	
	
	
}
