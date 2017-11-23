/**
 * 
 */
package com.quick.demo.cron.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.quick.demo.back.service.DemoService;
import com.quick.demo.db.entity.DemoEntity;
import com.quick.demo.db.entity.SendEntity;
import com.quick.demo.messages.bean.LabelReviewEmail;
import com.quick.demo.messages.receive.MessageReceiver;

/**
 * @author huicha
 *
 */
@Component
public class SendDemoTask {

	private static final Logger log = LoggerFactory.getLogger(SendDemoTask.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	@Autowired
	private DemoService demoService;

	@Scheduled(fixedRate = 55000)
	public void scheduleSearchUndeliveryDemos() {
		log.info("The time is now {}", dateFormat.format(new Date()));
		log.info("Looking for some demo to send {}", dateFormat.format(new Date()));
		for (DemoEntity demo : demoService.undeliveryDemos()) {
			for (SendEntity sendEntity : demo.getSenders()){
				LabelReviewEmail labelEmail = new LabelReviewEmail(sendEntity.getLabel().getEmail());
				labelEmail.setTransaction(sendEntity.getSendId());
				this.jmsMessagingTemplate.convertAndSend(MessageReceiver.LABEL_REVIEW_QUEUE, labelEmail);
			}
		}
	}

}
