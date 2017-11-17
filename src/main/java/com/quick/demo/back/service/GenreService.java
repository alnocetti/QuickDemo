/**
 * 
 */
package com.quick.demo.back.service;

import java.util.List;

import com.quick.demo.db.entity.GenreEntity;

/**
 * @author cristianhuichaqueo
 *
 */
public interface GenreService {

	public void createGenre(GenreEntity gender);

	public void deleteById(Long valueOf);
	
	public GenreEntity findOne(Long id);

	public List<GenreEntity> allGenres();
	
}
