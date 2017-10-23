package com.quick.demo.back.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.UserService;
import com.quick.demo.db.entity.User;
import com.quick.demo.db.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository accountsRepo;

	@Override
	public Integer getAccountIdByAliasUserAliasType(String userAlias, String aliasType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getAccountByAliasUserAliasType(String userAlias, String aliasType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getAccountByUserAlias(String userAlias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer existNicknameAccount(String kcUserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getUserIdByNickname(String userAlias) {
		// TODO Auto-generated method stub
		return null;
	}
	
}