/**
 * 
 */
package com.quick.demo.db.entity;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author huicha
 *
 */
@Entity
@Table(name = "send")
public class SendEntity implements Serializable {

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
	private DemoEntity demo;
	@ManyToOne
	@JoinColumn(name="labelId", referencedColumnName="labelId")
	private LabelEntity label;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, length = 19)
	private Date creationDate;
	
	public SendEntity() {
		this.creationDate = new Date();
	}
	
	/**
	 * @return the demo
	 */
	public DemoEntity getDemo() {
		return demo;
	}
	/**
	 * @param demo the demo to set
	 */
	public void setDemo(DemoEntity demo) {
		this.demo = demo;
	}
	/**
	 * @return the label
	 */
	public LabelEntity getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(LabelEntity label) {
		this.label = label;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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
