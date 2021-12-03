package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Login;
import com.example.demo.mapper.LoginMapper;

@Service
public class LoginService {

	@Autowired
	private LoginMapper loginMapper;

	@Transactional
	public void save(Login login) {
		loginMapper.save(login);
	}
	
	@Transactional
	public Login searchByUserId(Login login) {
		return searchByUserId(login);
	}
	
	@Transactional
	public Login searchByPassword(Login login) {
		return searchByPassword(login);
	}
	
	@Transactional
	public void update(Login login) {
		loginMapper.update(login);
	}
}