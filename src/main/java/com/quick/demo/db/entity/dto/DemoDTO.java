/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.util.ArrayList;
import java.util.List;

import com.quick.demo.db.entity.Demo;
import com.quick.demo.db.entity.Send;

/**
 * @author huicha
 *
 */
public class DemoDTO {

	private Long demoId;
	private String name;
	private String description;
	private String filepath;
	private Long genderId;
	private Long coverId;
	private List<Long> senders;
	
	public DemoDTO(Demo demo) {
		this.setCoverId(demo.getDemoId());
		this.setName(demo.getName());
		this.setDescription(demo.getFilepath());
		this.setFilepath(demo.getFilepath());
		this.setGenderId(demo.getGender().getGenderId());
		this.setCoverId(demo.getCover().getCoverId());
		List<Long> ids = new ArrayList<Long>();
		for (Send send : demo.getSenders()){
			ids.add(send.getSendId());
		}
		this.setSenders(ids);
	}
	/**
	 * @return the filepath
	 */
	public String getFilepath() {
		return filepath;
	}
	/**
	 * @param filepath the filepath to set
	 */
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	/**
	 * @return the coverId
	 */
	public Long getCoverId() {
		return coverId;
	}
	/**
	 * @param coverId the coverId to set
	 */
	public void setCoverId(Long coverId) {
		this.coverId = coverId;
	}
	/**
	 * @return the senders
	 */
	public List<Long> getSenders() {
		return senders;
	}
	/**
	 * @param senders the senders to set
	 */
	public void setSenders(List<Long> senders) {
		this.senders = senders;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the genderId
	 */
	public Long getGenderId() {
		return genderId;
	}
	/**
	 * @param genderId the genderId to set
	 */
	public void setGenderId(Long genderId) {
		this.genderId = genderId;
	}
	
}
