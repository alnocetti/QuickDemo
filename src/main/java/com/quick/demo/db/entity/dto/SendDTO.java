/**
 * 
 */
package com.quick.demo.db.entity.dto;

/**
 * @author huicha
 *
 */
public class SendDTO {

	private Long sendId;
	private Response response;
	
	/**
	 * @return the sendId
	 */
	public Long getSendId() {
		return sendId;
	}
	/**
	 * @param sendId the sendId to set
	 */
	public void setSendId(Long sendId) {
		this.sendId = sendId;
	}
	/**
	 * @return the response
	 */
	public Response getResponse() {
		return response;
	}
	/**
	 * @param response the response to set
	 */
	public void setResponse(Response response) {
		this.response = response;
	} 
	
}
