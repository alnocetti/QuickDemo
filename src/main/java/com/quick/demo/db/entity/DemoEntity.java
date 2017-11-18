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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.quick.demo.db.entity.dto.Demo;

/**
 * @author huicha
 *
 */
@Entity
@Table(name = "demo")
public class DemoEntity implements Serializable {

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
	private String year;
	@Column(nullable = false)
	private String filepath;
	@OneToOne
	private GenreEntity genre;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, length = 19)
	private Date creationDate;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="demoId", referencedColumnName="demoId")
	private List<SendEntity> senders;
	@ManyToOne
	@JoinColumn(name="artistId", referencedColumnName="artistId")
	private ArtistEntity artist;
	
	public DemoEntity() {
		this.creationDate = new Date();
	}
	
	public DemoEntity(Demo demo){
		this();
		this.setName(demo.getName());
		this.setYear(demo.getYear());
		this.setFilepath(demo.getFileId());
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
	 * @return the filepath
	 */
	public String getFilepath() {
		return filepath;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @param filepath the filepath to set
	 */
	public void setFilepath(String filepath) {
		this.filepath = filepath;
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
	 * @return the senders
	 */
	public List<SendEntity> getSenders() {
		return senders;
	}
	/**
	 * @param senders the senders to set
	 */
	public void setSenders(List<SendEntity> senders) {
		this.senders = senders;
	}

	/**
	 * @return the genre
	 */
	public GenreEntity getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(GenreEntity genre) {
		this.genre = genre;
	}

	/**
	 * @return the artist
	 */
	public ArtistEntity getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(ArtistEntity artist) {
		this.artist = artist;
	}
	
}
