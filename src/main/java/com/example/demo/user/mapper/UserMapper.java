package com.example.demo.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.user.vo.UserVo;

@Mapper
public interface UserMapper {

	int selectIdCheck(@Param("userId") String userId);

	int insertUser(UserVo userVo);

	int selectLogin(UserVo userVo);

}
