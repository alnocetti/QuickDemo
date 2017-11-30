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
	public ArtistEntity findOne(Long id) {
		return accountsRepo.findOne(id);
	}

	@Override
	public void deleteById(Long id) {
		accountsRepo.delete(id);
	}

	@Override
	public ArtistEntity createArtist(ArtistEntity entity) {
		return accountsRepo.save(entity);
	}
	
}