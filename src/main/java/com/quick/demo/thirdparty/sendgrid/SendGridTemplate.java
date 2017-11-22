/**
 * 
 */
package com.quick.demo.thirdparty.sendgrid;

import java.io.IOException;

import com.quick.demo.messages.bean.EmailTemplate;

/**
 * @author huicha
 *
 */
public interface SendGridTemplate {

	public String getTemplateId();
	
	public void send(EmailTemplate email) throws IOException;
	
}
