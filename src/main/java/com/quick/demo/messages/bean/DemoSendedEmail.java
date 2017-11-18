/**
 * 
 */
package com.quick.demo.messages.bean;

/**
 * @author huicha
 *
 */
public class DemoSendedEmail implements EmailTemplate {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5720873164542288086L;
	private String to;
	private String subjet;
	private String body;

	public DemoSendedEmail() {
	
	}
	
	public DemoSendedEmail(String to) {
		this.to = to;
	}

	public DemoSendedEmail(String to, String body, String subjet) {
		this.to = to;
		this.body = body;
		this.subjet = subjet;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubjet() {
		return subjet;
	}

	public void setSubjet(String subjet) {
		this.subjet = subjet;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return String.format("Email{to=%s, body=%s}", getTo(), getBody());
	}
}
