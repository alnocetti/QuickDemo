package com.quick.demo.back.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.ArtistService;
import com.quick.demo.db.entity.ArtistEntity;
import com.quick.demo.db.repository.ArtistRepository;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	private ArtistRepository accountsRepo;

	@Override
	public Integer getAccountIdByAliasUserAliasType(String userAlias, String aliasType) {
		return null;
	}

	@Override
	public ArtistEntity findOne(Long id) {
		return accountsRepo.findOne(id);
	}

	@Override
	public ArtistEntity getAccountByAliasUserAliasType(String userAlias, String aliasType) {
		return null;
	}

	@Override
	public ArtistEntity getAccountByUserAlias(String userAlias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer existNicknameAccount(String kcUserName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		accountsRepo.delete(id);
	}

	@Override
	public Integer getUserIdByNickname(String userAlias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createArtist(ArtistEntity entity) {
		accountsRepo.save(entity);
	}
	
}