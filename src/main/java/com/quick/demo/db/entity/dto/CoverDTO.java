/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.util.ArrayList;
import java.util.List;

import com.quick.demo.db.entity.Cover;
import com.quick.demo.db.entity.Demo;

/**
 * @author huicha
 *
 */
public class CoverDTO {

	private Long coverId;
	private String imagePath;
	private String name;
	private List<Long> demos;
	
	public CoverDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CoverDTO(Cover cover) {
		this.setCoverId(cover.getCoverId());
		this.setImagePath(cover.getImagePath());
		this.setName(cover.getName());
		List<Long> ids = new ArrayList<Long>();
		for (Demo demo : cover.getDemos()){
			ids.add(demo.getDemoId());
		}
		this.setDemos(ids);
	}
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
	/**
	 * @return the demos
	 */
	public List<Long> getDemos() {
		return demos;
	}
	/**
	 * @param demos the demos to set
	 */
	public void setDemos(List<Long> demos) {
		this.demos = demos;
	}
	
}
