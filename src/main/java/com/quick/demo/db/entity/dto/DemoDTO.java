/**
 * 
 */
package com.quick.demo.db.entity.dto;

/**
 * @author huicha
 *
 */
public class DemoDTO {

	private Long demoId;
	private String name;
	private String description;
	private GenderDTO gender;
	
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
	 * @return the gender
	 */
	public GenderDTO getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(GenderDTO gender) {
		this.gender = gender;
	}
	
}
