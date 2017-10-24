/**
 * 
 */
package com.quick.demo.back.service;

import com.quick.demo.db.entity.Cover;

/**
 * @author cristianhuichaqueo
 *
 */
public interface CoverService {

	public void createCover(Cover cover);
	
	public Cover findOne(Long id);

	public void deleteById(Long valueOf);

}
