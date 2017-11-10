package com.quick.demo.back.service.impl;

import java.util.List;

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
		return labelRepository.findOne(id);
	}

	@Override
	public List<Label> allLabels() {
		return labelRepository.findAll();
	}

	@Override
	public void createLabel(Label label) {
		labelRepository.saveAndFlush(label);
	}
	
}