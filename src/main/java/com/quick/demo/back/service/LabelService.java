/**
 * 
 */
package com.quick.demo.back.service;

import java.util.List;

import com.quick.demo.db.entity.LabelEntity;

/**
 * @author cristianhuichaqueo
 *
 */
public interface LabelService {
	
	public void deleteById(Long id);
	
	public LabelEntity findOne(Long id);

	public List<LabelEntity> allLabels();

	public void createLabel(LabelEntity label);

}
