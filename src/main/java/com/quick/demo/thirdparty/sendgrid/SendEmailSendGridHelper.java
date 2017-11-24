/**
 * 
 */
package com.quick.demo.thirdparty.sendgrid;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author huicha
 *
 */
public class SendEmailSendGridHelper {

	@Value("${sendgrid.emailfrom}")
    private String emailFrom;

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
