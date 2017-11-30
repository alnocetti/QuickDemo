/**
 * 
 */
package com.quick.demo.thirdparty.sendgrid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author huicha
 *
 */
@Component
public class SendEmailSendGridHelper {

	@Value("${sendgrid.key}")
	private String sendGridKey;
	@Value("${sendgrid.emailfrom}")
    private String emailFrom;

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
