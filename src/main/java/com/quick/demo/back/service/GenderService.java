/**
 * 
 */
package com.quick.demo.back.service;

import java.util.List;

import com.quick.demo.db.entity.Gender;

/**
 * @author cristianhuichaqueo
 *
 */
public interface GenderService {

	public void createGender(Gender gender);

	public void deleteById(Long valueOf);
	
	public Gender findOne(Long id);

	public List<Gender> allGenders();
	
}
