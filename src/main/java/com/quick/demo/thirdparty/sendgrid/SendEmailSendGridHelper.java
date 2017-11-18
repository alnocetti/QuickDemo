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
public class SendEmailSendGridHelper {

	@Value("${sendgrid.key}")
    private String sendGridKey;
	@Value("${sendgrid.emailfrom}")
    private String emailFrom;
	private String emailTo;

	public SendEmailSendGridHelper(String emailTo) {
		this.setEmailTo(emailTo);
	}
	
	public void send(String emailTo, String templateId) throws IOException {
		Email from = new Email(this.getEmailFrom());
		String subject = "I'm replacing the subject tag";
		Email to = new Email(emailTo);
		Content content = new Content("text/html", "I'm replacing the <strong>body tag</strong>");
		Mail mail = new Mail(from, subject, to, content);
		mail.personalization.get(0).addSubstitution("-name-", "Example User");
		mail.personalization.get(0).addSubstitution("-city-", "Denver");
		mail.setTemplateId(templateId);

		SendGrid sg = new SendGrid(sendGridKey);
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

	/**
	 * @return the emailTo
	 */
	public String getEmailTo() {
		return emailTo;
	}

	/**
	 * @param emailTo the emailTo to set
	 */
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	/**
	 * @return the sendGridKey
	 */
	public String getSendGridKey() {
		return sendGridKey;
	}

	/**
	 * @param sendGridKey the sendGridKey to set
	 */
	public void setSendGridKey(String sendGridKey) {
		this.sendGridKey = sendGridKey;
	}

	/**
	 * @return the emailFrom
	 */
	public String getEmailFrom() {
		return emailFrom;
	}

	/**
	 * @param emailFrom the emailFrom to set
	 */
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
}
