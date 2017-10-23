package com.quick.demo.rest.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * <b><U>Attributes</U>:</b> <p>
 *  <b>error</b>: code for response status. <br>
 *  <b>message</b>: description for response status.
 *
 */
@JsonInclude(Include.NON_NULL)
public class QuickDemoResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3521911621574114639L;
	
	public QuickDemoResponse(){
	}
	
	public QuickDemoResponse(String error, String message){
		setError(error);
		setMessage(message);
	}
	
	@ApiModelProperty(notes="Code of error. When is ok code is 0") 
	private String error;
	@ApiModelProperty(notes="Message of error. When is ok, message is SUCCESS")
	private String message;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
