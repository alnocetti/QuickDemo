/**
 * 
 */
package com.quick.demo.db.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author huicha
 *
 */
@Entity
@Table(name = "gender")
public class Gender implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4727148428480359203L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long genderId;
	@Column(name = "name", nullable = false)
	private String name;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "genders")
	private List<Label> labels;
	
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
	public List<Label> getLabels() {
		return labels;
	}
	/**
	 * @param labels the labels to set
	 */
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}
	
}
