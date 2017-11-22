/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.io.Serializable;
import java.util.List;

import com.quick.demo.db.entity.DemoEntity;

/**
 * @author huicha
 *
 */
public class Demo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5531244118694259977L;
	
	private Long demoId;
	private String name;
	private String fileId;
	private String year;
	private Long genreId;
	private List<Long> senders;
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public Demo(DemoEntity demo) {
		this.setName(demo.getName());
		this.setYear(demo.getYear());
		this.setGenreId(demo.getDemoId());
	}

	/**
	 * @return the fileId
	 */
	public String getFileId() {
		return fileId;
	}
	/**
	 * @param fileId the fileId to set
	 */
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	/**
	 * @return the senders
	 */
	public List<Long> getSenders() {
		return senders;
	}
	/**
	 * @param senders the senders to set
	 */
	public void setSenders(List<Long> senders) {
		this.senders = senders;
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
	 * @return the genreId
	 */
	public Long getGenreId() {
		return genreId;
	}

	/**
	 * @param genreId the genreId to set
	 */
	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}
	
}
