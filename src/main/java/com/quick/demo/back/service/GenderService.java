/**
 * 
 */
package com.quick.demo.back.service;

import com.quick.demo.db.entity.Gender;

/**
 * @author cristianhuichaqueo
 *
 */
public interface GenderService {

	public void createGender(Gender gender);

	public void removeGender(Long valueOf);
	
}
