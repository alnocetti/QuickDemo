package com.quick.demo.back.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.DemoService;
import com.quick.demo.db.entity.Demo;
import com.quick.demo.db.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoRepository demoRepository;

	@Override
	public void deleteById(Long id) {
		demoRepository.delete(id);
	}

	@Override
	public Demo findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}