package com.quick.demo.messages.receive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.quick.demo.messages.bean.DemoSendedEmail;
import com.quick.demo.messages.bean.LabelReviewEmail;
import com.quick.demo.messages.receive.processor.DemoSendedTemplateProcessor;
import com.quick.demo.messages.receive.processor.LabelReviewTemplateProcessor;

@Component
public class MessageReceiver {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	// email to artist
	public static final String DEMO_SENDED_QUEUE = "demo_sended";
	// email to label
	public static final String LABEL_REVIEW_QUEUE = "label_review";
	
	@Autowired
	private LabelReviewTemplateProcessor labelReviewTemplateProcessor; 
    @Autowired
    private DemoSendedTemplateProcessor demoSendedTemplateProcessor;
	
    @JmsListener(destination = MessageReceiver.DEMO_SENDED_QUEUE, containerFactory = "quickDemoFactory")
    public void receiveDemoSendedMessage(DemoSendedEmail labelEmail) {
	    try {
	    	demoSendedTemplateProcessor.send(labelEmail);
	    } catch (Exception e) {
	    	logger.error("ERROR AL INTENTAR PROCESAR DEMO_SENDED_QUEUE: ", e);
	    }
    }
    
    @JmsListener(destination = MessageReceiver.LABEL_REVIEW_QUEUE, containerFactory = "quickDemoFactory")
    public void receiveLabelReviewMessage(LabelReviewEmail labelEmail) {
	    try {
	    	labelReviewTemplateProcessor.send(labelEmail);
	    } catch (Exception e) {
	    	logger.error("ERROR AL INTENTAR PROCESAR LABEL_REVIEW_QUEUE: ", e);
	    }
    }
    
}
