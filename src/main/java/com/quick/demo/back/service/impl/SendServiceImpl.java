/**
 * 
 */
package com.quick.demo.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.SendService;
import com.quick.demo.db.entity.SendEntity;
import com.quick.demo.db.repository.SendRepository;

/**
 * @author huicha
 *
 */
@Service
public class SendServiceImpl implements SendService {

	@Autowired
	private SendRepository sendRepository;
	
	/* (non-Javadoc)
	 * @see com.quick.demo.back.service.SendService#deleteById(java.lang.Long)
	 */
	@Override
	public void deleteById(Long id) {
		sendRepository.delete(id);
	}

	/* (non-Javadoc)
	 * @see com.quick.demo.back.service.SendService#findOne(java.lang.Long)
	 */
	@Override
	public SendEntity findOne(Long id) {
		return sendRepository.findOne(id);
	}

	/* (non-Javadoc)
	 * @see com.quick.demo.back.service.SendService#allSenders()
	 */
	@Override
	public List<SendEntity> allSenders() {
		return sendRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.quick.demo.back.service.SendService#createSend(com.quick.demo.db.entity.Send)
	 */
	@Override
	public void createSend(SendEntity entity) {
		sendRepository.save(entity);
	}

}
