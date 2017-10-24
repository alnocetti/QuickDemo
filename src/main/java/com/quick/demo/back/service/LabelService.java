/**
 * 
 */
package com.quick.demo.back.service;

import com.quick.demo.db.entity.Label;

/**
 * @author cristianhuichaqueo
 *
 */
public interface LabelService {
	
	public void deleteById(Long id);
	
	public Label findOne(Long id);

}
