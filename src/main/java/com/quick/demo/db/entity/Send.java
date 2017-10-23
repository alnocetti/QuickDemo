/**
 * 
 */
package com.quick.demo.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author huicha
 *
 */
@Entity
@Table(name = "send")
public class Send implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2617187349961095788L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long sendId;
	@Enumerated(EnumType.STRING)
	private Response response;
	@ManyToOne
	@JoinColumn(name="demoId", referencedColumnName="demoId")
	private Demo demo;
	@ManyToOne
	@JoinColumn(name="labelId", referencedColumnName="labelId")
	private Label label;
	
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
