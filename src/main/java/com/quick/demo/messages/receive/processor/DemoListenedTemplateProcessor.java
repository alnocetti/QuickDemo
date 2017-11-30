/**
 * 
 */
package com.quick.demo.messages.receive.processor;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.quick.demo.back.service.SendService;
import com.quick.demo.db.entity.SendEntity;
import com.quick.demo.messages.bean.DemoListenedEmail;
import com.quick.demo.messages.bean.EmailTemplate;
import com.quick.demo.thirdparty.sendgrid.SendEmailSendGridHelper;
import com.quick.demo.thirdparty.sendgrid.SendGridTemplate;
import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

/**
 * @author huicha
 *
 */
@Component
@Scope("singleton")
public class DemoListenedTemplateProcessor extends SendEmailSendGridHelper implements SendGridTemplate {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${sendgrid.template.demolistened}")
	private String templateId;
	@Autowired
	private SendService sendService;

	/**
	 * @param templateId
	 *            the templateId to set
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	@Override
	public String getTemplateId() {
		return templateId;
	}

	@Override
	public void send(EmailTemplate email) throws IOException {
		DemoListenedEmail demoListenedEmail = (DemoListenedEmail) email;
		SendEntity se = sendService.findOne(demoListenedEmail.getSendId());

		Email from = new Email(this.getEmailFrom());
		Email to = new Email(se.getDemo().getArtist().getEmail());
		Content content = new Content("text/html", "I'm replacing the <strong>body tag</strong>");
		Mail mail = new Mail(from, "Demo Listened", to, content);

		mail.personalization.get(0).addSubstitution("-urlImagen-",
				"http://quickdemo.rarahavis.com/Images/ImagenMailTracker.jpg");
		mail.personalization.get(0).addSubstitution("-sello-", se.getLabel().getName());
		mail.setTemplateId(this.getTemplateId());

		System.out.println("SG SENDING EMAIL WITH API KEY:" + this.getSendGridKey());
		SendGrid sg = new SendGrid(this.getSendGridKey());

		Request request = new Request();
		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);
			logger.debug("Response status code: ", response.getStatusCode());
			logger.debug("Response body: ", response.getBody());
			logger.debug("Response headers: ", response.getHeaders());
			if (response.getStatusCode() == 202) {
				logger.info("email was sucesfully sended");
			}
		} catch (IOException ex) {
			logger.error("Error ocurred when the system sending email to label: ", ex.getMessage());
			throw ex;
		}
	}

}
