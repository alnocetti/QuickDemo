package com.quick.demo.back.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.demo.back.service.DemoService;
import com.quick.demo.db.entity.DemoEntity;
import com.quick.demo.db.entity.SendEntity;
import com.quick.demo.db.entity.dto.Demo;
import com.quick.demo.db.entity.dto.PendingDemo;
import com.quick.demo.db.repository.DemoRepository;
import com.quick.demo.db.repository.SendRepository;

/**
 * 
 * @author cristianhuichaqueo
 *
 */
@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoRepository demoRepository;
	@Autowired
	private SendRepository sendRepository;

	@Override
	public void deleteById(Long id) {
		demoRepository.delete(id);
	}

	@Override
	public Demo findOne(Long id) {
		DemoEntity demoentity = demoRepository.findOne(id);
		Demo demo = new Demo(demoentity);
		List<Long> sendersIds = new ArrayList<Long>();
		List<SendEntity> senders = sendRepository.findOneByDemoId(demoentity.getDemoId());
		for (SendEntity e : senders){
			sendersIds.add(e.getSendId());
			demo.setSenders(sendersIds);
		}
		return demo;
	}

	@Override
	public List<DemoEntity> allDemos() {
		return demoRepository.findAll();
	}

	@Override
	public void createDemo(DemoEntity demo) {
		demoRepository.saveAndFlush(demo);
	}

	@Override
	public List<Demo> undeliveryDemos() {
		List<Demo> demos = new ArrayList<Demo>();
		for (DemoEntity demoentity : demoRepository.undeliveryDemos()){
			Demo demo = new Demo(demoentity);
			List<Long> sendersIds = new ArrayList<Long>();
			List<SendEntity> senders = sendRepository.findOneByDemoId(demoentity.getDemoId());
			for (SendEntity e : senders){
				sendersIds.add(e.getSendId());
				demo.setSenders(sendersIds);
			}
			demos.add(demo);
		}
		return demos;
	}

	@Override
	public PendingDemo findPendingDemo(Long idDemo) {
		DemoEntity demoEntity = demoRepository.findOne(idDemo);
		PendingDemo pendingDemo = new PendingDemo();
		pendingDemo.setArtistEmail(demoEntity.getArtist().getEmail());
		List<String> labels = new ArrayList<String>();
		List<SendEntity> senders = sendRepository.findOneByDemoId(demoEntity.getDemoId());
		for (SendEntity sendEntity : senders){
			labels.add(sendEntity.getLabel().getName());
		}
		pendingDemo.setLabelsNames(labels);
		return pendingDemo;
	}

}