/**
 * 
 */
package com.quick.demo.back.service;

import com.quick.demo.db.entity.Demo;

/**
 * @author cristianhuichaqueo
 *
 */
public interface DemoService {

	public void deleteById(Long valueOf);
	
	public Demo findOne(Long id);
	
}
