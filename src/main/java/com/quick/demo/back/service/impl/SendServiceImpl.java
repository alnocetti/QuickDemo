/**
 * 
 */
package com.quick.demo.back.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.SendService;
import com.quick.demo.db.entity.SendEntity;
import com.quick.demo.db.entity.dto.SharedDemos;
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

	@Override
	public void update(SendEntity sendEntity) {
		sendRepository.saveAndFlush(sendEntity);
	}

	@Override
	public List<SharedDemos> allSharedDemos() {
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
		List<SharedDemos> all = new ArrayList<SharedDemos>();
		for (SendEntity sendEntity : sendRepository.findAll()){
			SharedDemos send = new SharedDemos();
			send.setArtist(sendEntity.getDemo().getArtist().getArtistName());
			String strDate = sm.format(sendEntity.getDemo().getCreationDate());
			Date dt = null;
			try {
				dt = sm.parse(strDate);
			} catch (ParseException e) {
				// nothing to do
			}
			send.setCreationDate(dt.toString());
			send.setDemoName(sendEntity.getDemo().getName());
			send.setGenre(sendEntity.getDemo().getGenre().getName());
			send.setPathId(sendEntity.getDemo().getFilepath());
			send.setStatus(sendEntity.getStatus().toString());
			send.setDemoId(sendEntity.getDemo().getDemoId());
			send.setLabel(sendEntity.getLabel().getName());
			all.add(send);
		}
		return all;
	}

}
