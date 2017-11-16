package com.quick.demo.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.GenderService;
import com.quick.demo.db.entity.GenreEntity;
import com.quick.demo.db.repository.GenreRepository;

@Service
public class GenderServiceImpl implements GenderService{

	@Autowired
	private GenreRepository genderRepository;

	@Override
	public void createGender(GenreEntity gender) {
		genderRepository.saveAndFlush(gender);
	}

	@Override
	public void deleteById(Long valueOf) {
		genderRepository.delete(valueOf);
	}

	@Override
	public GenreEntity findOne(Long id) {
		return genderRepository.findOne(id);
	}

	@Override
	public List<GenreEntity> allGenders() {
		return genderRepository.findAll();
	}
	
}