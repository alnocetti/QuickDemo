/**
 * 
 */
package com.quick.demo.back.service;

import java.util.List;

import com.quick.demo.db.entity.Label;

/**
 * @author cristianhuichaqueo
 *
 */
public interface LabelService {
	
	public void deleteById(Long id);
	
	public Label findOne(Long id);

	public List<Label> allLabels();

	public void createLabel(Label label);

}
