/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.util.List;

/**
 * @author huicha
 *
 */
public class GenderDTO {

	private Long genderId;
	private String name;
	private List<Long> labels;
	
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
	 * @return the labels
	 */
	public List<Long> getLabels() {
		return labels;
	}
	/**
	 * @param labels the labels to set
	 */
	public void setLabels(List<Long> labels) {
		this.labels = labels;
	}
	
}