package com.example.demo.users.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.users.UsersVO;

@Mapper
public interface UsersMapper {
	UsersVO getUsersInfo(String userid);
}
