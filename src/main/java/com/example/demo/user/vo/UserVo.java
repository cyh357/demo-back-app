package com.example.demo.user.vo;

import com.example.demo.user.dto.UserDto;

public class UserVo {
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
	
	public UserVo() {}
	
	// DTO를 직접 받는 생성자 정의
    public UserVo(UserDto dto) {
        this.userId = dto.getUserId();
        this.password = dto.getPassword();
    }
}
