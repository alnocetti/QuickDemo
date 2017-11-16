/**
 * 
 */
package com.quick.demo.thirdparty.sendgrid;

import java.io.IOException;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

/**
 * @author huicha
 *
 */
public class SendEmailSendGrid {

	public SendEmailSendGrid() throws IOException {
		SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
		try {
			Request request = new Request();
			request.setMethod(Method.GET);
			request.setEndpoint("api_keys");
			Response response = sg.api(request);
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody());
			System.out.println(response.getHeaders());
		} catch (IOException ex) {
			throw ex;
		}
	}

}
