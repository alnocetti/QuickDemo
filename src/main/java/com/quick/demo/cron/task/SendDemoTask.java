/**
 * 
 */
package com.quick.demo.cron.task;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.quick.demo.back.service.DemoService;
import com.quick.demo.back.service.SendService;
import com.quick.demo.db.entity.DemoEntity;
import com.quick.demo.db.entity.Response;
import com.quick.demo.db.entity.SendEntity;
import com.quick.demo.thirdparty.sendgrid.ArtistDemoSendedTemplate;
import com.quick.demo.thirdparty.sendgrid.LabelReceiveDemoTemplate;

/**
 * @author huicha
 *
 */
@Component
public class SendDemoTask {

	private static final Logger log = LoggerFactory.getLogger(SendDemoTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
	private DemoService demoService;
    @Autowired
	private SendService sendService;
    
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        log.info("Looking for some demo to send {}", dateFormat.format(new Date()));
        for (DemoEntity demo : demoService.undeliveryDemos()){
        	ArtistDemoSendedTemplate artistDemoSendedTemplate = new ArtistDemoSendedTemplate(demo.getArtist().getEmail());
        	try {
				artistDemoSendedTemplate.send();
			} catch (IOException e1) {
				log.error("Ups! some error sending email to artist {}", dateFormat.format(new Date()), e1.getMessage());
			}
        	for (SendEntity send : demo.getSenders()){
        		String labelEmail = send.getLabel().getMail();
        		LabelReceiveDemoTemplate receiveDemoTemplate = new LabelReceiveDemoTemplate(labelEmail);
        		try {
					receiveDemoTemplate.send();
					send.setResponse(Response.DELIVERED);
					sendService.update(send);
				} catch (IOException e) {
					log.error("Ups! some error sending email to label {}", dateFormat.format(new Date()), e.getMessage());
				}
        	}
        }
    }
	
}
