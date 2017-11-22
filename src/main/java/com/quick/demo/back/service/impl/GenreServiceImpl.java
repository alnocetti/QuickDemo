package com.quick.demo.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.GenreService;
import com.quick.demo.db.entity.GenreEntity;
import com.quick.demo.db.repository.GenreRepository;

@Service
public class GenreServiceImpl implements GenreService{

	@Autowired
	private GenreRepository genreRepository;

	@Override
	public void createGenre(GenreEntity gender) {
		genreRepository.saveAndFlush(gender);
	}

	@Override
	public void deleteById(Long valueOf) {
		genreRepository.delete(valueOf);
	}

	@Override
	public GenreEntity findOne(Long id) {
		return genreRepository.findOne(id);
	}

	@Override
	public List<GenreEntity> allGenres() {
		return genreRepository.findAll();
	}
	
}