package com.quick.demo.messages.bean;

/**
 * 
 * @author huicha
 *
 */
public class LabelReviewEmail implements EmailTemplate {

	private String to;
	private String subjet;
	private String body;

	public LabelReviewEmail() {
	}

	public LabelReviewEmail(String to, String body) {
		this.to = to;
		this.body = body;
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
