/**
 * 
 */
package com.quick.demo.db.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.quick.demo.db.entity.dto.Artist;

/**
 * @author huicha
 *
 */
@Entity
@Table(name = "artist")
public class ArtistEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8339682158262840560L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long artistId;
	@Column(name = "real_name", nullable = false, length = 200)
	private String realName;
	@Column(name = "artist_name", nullable = false, length = 200)
	private String artistName;
	@Column(name = "email", nullable = false, length = 200)
	private String email;
	@Column(name = "birthday")
	private Date birthday;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, length = 19)
	private Date creationDate;
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="artistId", referencedColumnName="artistId")
	private List<DemoEntity> demos ;
	
	public ArtistEntity() {
		this.creationDate = new Date();
	}
	
	public ArtistEntity(Artist artist) {
		this();
		this.setArtistName(artist.getArtistName());
		this.setRealName(artist.getRealName());
		this.setBirthday(artist.getBirthday());
		this.setEmail(artist.getEmail());
	}

	/**
	 * @return the artistId
	 */
	public Long getArtistId() {
		return artistId;
	}

	/**
	 * @param artistId the artistId to set
	 */
	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}

	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * @return the artistName
	 */
	public String getArtistName() {
		return artistName;
	}

	/**
	 * @param artistName the artistName to set
	 */
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
	 * @return the demos
	 */
	public List<DemoEntity> getDemos() {
		return demos;
	}

	/**
	 * @param demos the demos to set
	 */
	public void setDemos(List<DemoEntity> demos) {
		this.demos = demos;
	}

}
