/**
 * 
 */
package com.quick.demo.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
}
