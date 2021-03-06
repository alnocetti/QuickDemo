/**
 * 
 */
package com.quick.demo.db.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author huicha
 *
 */
@Entity
@Table(name = "label")
public class LabelEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5287448052504953400L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long labelId;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "email", nullable = false)
	private String email;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "label_genre", joinColumns = {
				@JoinColumn(name = "labelId", nullable = false, updatable = false) 
			},
			inverseJoinColumns = { 
				@JoinColumn(name = "genreId", nullable = false, updatable = false) 
			})
	private List<GenreEntity> genres;	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, length = 19)
	private Date creationDate;
	
	public LabelEntity() {
		this.creationDate = new Date();
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
	public String getEmail() {
		return email;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setEmail(String mail) {
		this.email = mail;
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
	 * @return the genres
	 */
	public List<GenreEntity> getGenres() {
		return genres;
	}
	/**
	 * @param genres the genres to set
	 */
	public void setGenres(List<GenreEntity> genres) {
		this.genres = genres;
	}
	
}
