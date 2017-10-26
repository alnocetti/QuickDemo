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
	private ResponseDTO response;
	private Long demoId;
	private Long labelId;
	
	public SendDTO() {
		// TODO Auto-generated constructor stub
	}
	
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
	public ResponseDTO getResponse() {
		return response;
	}
	/**
	 * @param response the response to set
	 */
	public void setResponse(ResponseDTO response) {
		this.response = response;
	}
	/**
	 * @return the demoId
	 */
	public Long getDemoId() {
		return demoId;
	}
	/**
	 * @param demoId the demoId to set
	 */
	public void setDemoId(Long demoId) {
		this.demoId = demoId;
	}
	/**
	 * @return the labelId
	 */
	public Long getLabelId() {
		return labelId;
	}
	/**
	 * @param labelId the labelId to set
	 */
	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	} 
	
}
