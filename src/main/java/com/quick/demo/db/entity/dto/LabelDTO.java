/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.util.ArrayList;
import java.util.List;

import com.quick.demo.db.entity.Gender;
import com.quick.demo.db.entity.Label;

/**
 * @author huicha
 *
 */
public class LabelDTO {

	private Long labelId;
	private String name;
	private String mail;
	private List<Long> genders;
	
	public LabelDTO(Label label) {
		this.setLabelId(label.getLabelId());
		this.setName(label.getName());
		this.setMail(label.getMail());
		List<Long> ids = new ArrayList<Long>();
		for (Gender gender : label.getGenders()){
			ids.add(gender.getGenderId());
		}
		this.setGenders(ids);
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
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
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
	 * @return the genders
	 */
	public List<Long> getGenders() {
		return genders;
	}
	/**
	 * @param genders the genders to set
	 */
	public void setGenders(List<Long> genders) {
		this.genders = genders;
	}
	
}
