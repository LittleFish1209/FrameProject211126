package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Login;

@Mapper
public interface LoginMapper {

	void save(Login login);
	Login searchByUserId(Login login);
	Login searchByPassword(Login login);
	void update(Login login);
}
