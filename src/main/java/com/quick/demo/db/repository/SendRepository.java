package com.quick.demo.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quick.demo.db.entity.SendEntity;

/**
 * 
 * @author huicha
 */
@Repository
@Transactional
public interface SendRepository  extends JpaRepository<SendEntity, Long>{

	/**
	 * Gets the availability of an user alias.
	 * @return Integer 0 is available - 1 is not available.
	 */
	@Query("SELECT count(*) FROM SendEntity s")
	public Integer countSenders();
	
	/**
	 * Gets the availability of an user alias.
	 * @return Integer 0 is available - 1 is not available.
	 */
	@Query("FROM SendEntity s WHERE s.status = 'PENDING'")
	public List<SendEntity> pendings();
	
}
