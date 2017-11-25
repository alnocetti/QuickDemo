/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.io.Serializable;

import com.quick.demo.db.entity.SendEntity;

/**
 * @author huicha
 *
 */
public class Send implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8323999302370299394L;
	
	private Long sendId;
	private String status;
	private Long demoId;
	private Long labelId;
	
	public Send() {
		// TODO Auto-generated constructor stub
	}
	
	public Send(SendEntity sendEntity) {
		this.setDemoId(sendEntity.getDemo().getDemoId());
		this.setSendId(sendEntity.getSendId());
		this.setStatus(sendEntity.getStatus().toString());
		this.setLabelId(sendEntity.getLabel().getLabelId());
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	} 
	
}
