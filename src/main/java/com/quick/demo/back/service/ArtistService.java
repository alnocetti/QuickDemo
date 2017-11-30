package com.quick.demo.back.service;

import com.quick.demo.db.entity.ArtistEntity;

public interface ArtistService {

	public ArtistEntity createArtist(ArtistEntity entity);
	
	/**
	 * search an user by id.
	 * @param id
	 * @return User
	 */
	public ArtistEntity findOne(Long id);

	/**
	 * Delete an account by your id.
	 * @param id
	 */
	public void deleteById(Long id);
	
}
