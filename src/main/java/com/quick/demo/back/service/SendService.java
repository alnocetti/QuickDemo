/**
 * 
 */
package com.quick.demo.back.service;

import java.util.List;

import com.quick.demo.db.entity.SendEntity;

/**
 * @author cristianhuichaqueo
 *
 */
public interface SendService {
	
	public void deleteById(Long id);
	
	public SendEntity findOne(Long id);

	public List<SendEntity> allSenders();

	public void createSend(SendEntity send);
	
	public void update(SendEntity send);

}
