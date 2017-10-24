package com.quick.demo.back.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.LabelService;
import com.quick.demo.db.entity.Label;
import com.quick.demo.db.repository.LabelRepository;

@Service
public class LabelServiceImpl implements LabelService {

	@Autowired
	private LabelRepository labelRepository;

	@Override
	public void deleteById(Long id) {
		labelRepository.delete(id);
	}

	@Override
	public Label findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}