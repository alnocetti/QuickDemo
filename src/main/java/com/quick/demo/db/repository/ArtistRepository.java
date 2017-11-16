package com.quick.demo.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quick.demo.db.entity.ArtistEntity;

/**
 * 
 * @author huicha
 */
@Repository
@Transactional
public interface ArtistRepository  extends JpaRepository<ArtistEntity, Long>{

	/**
	 * Gets the availability of an user alias.
	 * @return Integer 0 is available - 1 is not available.
	 */
	@Query("SELECT count(*) FROM ArtistEntity A")
	public Integer countArtist();
	
}
