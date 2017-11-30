/**
 * 
 */
package com.quick.demo.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLDecoder;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quick.demo.back.service.SendService;
import com.quick.demo.db.entity.SendEntity;
import com.quick.demo.db.entity.Status;
import com.quick.demo.messages.bean.DemoListenedEmail;
import com.quick.demo.messages.bean.DemoOpenedEmail;
import com.quick.demo.messages.receive.MessageReceiver;

/**
 * @author cristianhuichaqueo
 *
 */
@Controller
public class IndexWebController {

	@Autowired
	private SendService sendService;
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@RequestMapping("/")
	public String home() {
		return index();
	}

	public String index() {
		return "index.html";
	}

	@RequestMapping("/dashboard")
	public String dashboard() {
		return "/views/dashboards-project";
	}

	@ResponseBody
	@RequestMapping(value = "/mailOpenTracking", method = RequestMethod.GET)
	public ResponseEntity<byte[]> mailOpenTracking(Long id) throws IOException {
		SendEntity send = sendService.findOne(id);
		send.setStatus(Status.OPENED);
		sendService.update(send);

		DemoOpenedEmail demoEmail = new DemoOpenedEmail(send.getSendId());
		this.jmsMessagingTemplate.convertAndSend(MessageReceiver.DEMO_OPENED_QUEUE, demoEmail);

		URL r = this.getClass().getResource("/");
		String decoded = URLDecoder.decode(r.getFile(), "UTF-8");

		if (decoded.startsWith("/")) {
			decoded = decoded.replaceFirst("/", "");
		}
		File in = new File(decoded, "/static/Images/ImagenMailTracker.jpg");
		InputStream strim = new FileInputStream(in);
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_JPEG);

		return new ResponseEntity<byte[]>(IOUtils.toByteArray(strim), headers, HttpStatus.CREATED);
	}

	@RequestMapping("/listenTracking")
	public String listenTracking(Long id) {
		SendEntity send = sendService.findOne(id);
		send.setStatus(Status.LISTENED);
		sendService.update(send);

		DemoListenedEmail demoEmail = new DemoListenedEmail(send.getSendId());
		this.jmsMessagingTemplate.convertAndSend(MessageReceiver.DEMO_LISTENED_QUEUE, demoEmail);

		return "redirect:https://cdn.filestackcontent.com/" + send.getDemo().getFilepath();
	}

}
