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

	private static final String SENDGRID_API_KEY = "SENDGRID_API_KEY";
	@Value("${sendgrid.emailfrom}")
    private String emailFrom;

	/**
	 * @return the sendGridKey
	 */
	public String getSendGridKey() {
		return System.getenv(SendEmailSendGridHelper.SENDGRID_API_KEY);
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
