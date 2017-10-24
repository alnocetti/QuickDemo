/**
 * 
 */
package com.quick.demo.db.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author huicha
 *
 */
@Entity
@Table(name = "demo")
public class Demo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5529512224196080928L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long demoId;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private String filepath;
	@OneToOne
	private Gender gender;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="demoId", referencedColumnName="demoId")
	private List<Send> senders;
	@ManyToOne
	@JoinColumn(name="coverId", referencedColumnName="coverId")
	private Cover cover; 
	
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
	 * @return the cover
	 */
	public Cover getCover() {
		return cover;
	}
	/**
	 * @param cover the cover to set
	 */
	public void setCover(Cover cover) {
		this.cover = cover;
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
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/**
	 * @return the senders
	 */
	public List<Send> getSenders() {
		return senders;
	}
	/**
	 * @param senders the senders to set
	 */
	public void setSenders(List<Send> senders) {
		this.senders = senders;
	}
	
}
