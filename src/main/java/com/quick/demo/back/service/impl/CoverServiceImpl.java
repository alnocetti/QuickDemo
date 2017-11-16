/**
 * 
 */
package com.quick.demo.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.CoverService;
import com.quick.demo.db.entity.Cover;
import com.quick.demo.db.repository.CoverRepository;

/**
 * @author huicha
 *
 */
@Service
public class CoverServiceImpl implements CoverService {

	@Autowired
	private CoverRepository coverRepository;
	
	@Override
	public void createCover(Cover cover) {
		coverRepository.saveAndFlush(cover);
	}

	@Override
	public void deleteById(Long valueOf) {
		coverRepository.delete(valueOf);
	}

	@Override
	public Cover findOne(Long id) {
		return coverRepository.findOne(id);
	}

	@Override
	public List<Cover> allCovers() {
		return coverRepository.findAll();
	}

}