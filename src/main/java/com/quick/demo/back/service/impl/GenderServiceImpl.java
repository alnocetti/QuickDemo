package com.quick.demo.back.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.GenderService;
import com.quick.demo.db.entity.Gender;
import com.quick.demo.db.repository.GenderRepository;

@Service
public class GenderServiceImpl implements GenderService{

	@Autowired
	private GenderRepository genderRepository;

	@Override
	public void createGender(Gender gender) {
		genderRepository.saveAndFlush(gender);
	}

	@Override
	public void removeGender(Long valueOf) {
		genderRepository.delete(valueOf);
	}
	
}