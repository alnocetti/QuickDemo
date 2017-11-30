/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.io.Serializable;

/**
 * @author huicha
 *
 */
public class SharedDemos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6342308167396958456L;
	
	private String artist;
	private Long demoId;
	private String label;
	private String demoName;
	private String genre;
	private String creationDate;
	private String status;
	private String pathId;
	
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the demoName
	 */
	public String getDemoName() {
		return demoName;
	}
	/**
	 * @param demoName the demoName to set
	 */
	public void setDemoName(String demoName) {
		this.demoName = demoName;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the creationDate
	 */
	public String getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the pathId
	 */
	public String getPathId() {
		return pathId;
	}
	/**
	 * @param pathId the pathId to set
	 */
	public void setPathId(String pathId) {
		this.pathId = pathId;
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
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
}
