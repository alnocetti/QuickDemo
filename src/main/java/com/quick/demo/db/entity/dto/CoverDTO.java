/**
 * 
 */
package com.quick.demo.db.entity.dto;

/**
 * @author huicha
 *
 */
public class CoverDTO {

	private Long coverId;
	private String imagePath;
	private String name;
	
	/**
	 * @return the coverId
	 */
	public Long getCoverId() {
		return coverId;
	}
	/**
	 * @param coverId the coverId to set
	 */
	public void setCoverId(Long coverId) {
		this.coverId = coverId;
	}
	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}
	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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
