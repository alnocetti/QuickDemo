/**
 * 
 */
package com.quick.demo.thirdparty.sendgrid;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;

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
public class ArtistDemoSendedTemplate extends SendEmailSendGridHelper implements SendGridTemplate {

	@Value("${sendgrid.template.artistdemosended}")
    private String templateId;
	
	public ArtistDemoSendedTemplate(String emailTo) {
		super(emailTo);
	}

	/**
	 * @param templateId the templateId to set
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	@Override
	public String getTemplateId() {
		return templateId;
	}
	
	public void send() throws IOException {
		Email from = new Email(this.getEmailFrom());
		String subject = "I'm replacing the subject tag";
		Email to = new Email(this.getEmailTo());
		Content content = new Content("text/html", "I'm replacing the <strong>body tag</strong>");
		Mail mail = new Mail(from, subject, to, content);
		mail.personalization.get(0).addSubstitution("-name-", "Example User");
		mail.personalization.get(0).addSubstitution("-city-", "Denver");
		mail.setTemplateId(this.getTemplateId());

		SendGrid sg = new SendGrid(super.getSendGridKey());
		Request request = new Request();
		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody());
			System.out.println(response.getHeaders());
		} catch (IOException ex) {
			throw ex;
		}
	}
	
}
