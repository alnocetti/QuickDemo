/**
 * 
 */
package com.quick.demo.thirdparty.sendgrid;

import java.io.IOException;

/**
 * @author huicha
 *
 */
public interface SendGridTemplate {

	public String getTemplateId();
	
	public void send() throws IOException;
	
}
