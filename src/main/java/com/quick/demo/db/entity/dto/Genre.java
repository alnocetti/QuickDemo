/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.util.ArrayList;
import java.util.List;

import com.quick.demo.db.entity.GenreEntity;
import com.quick.demo.db.entity.LabelEntity;

/**
 * @author huicha
 *
 */
public class Genre {

	private Long genreId;
	private String name;
	private List<Long> labels;
	
	public Genre() {
		// TODO Auto-generated constructor stub
	}
	
	public Genre(GenreEntity genre) {
		this.setGenreId(genre.getGenreId());
		this.setName(genre.getName());
		List<Long> ids = new ArrayList<Long>();
		for (LabelEntity label : genre.getLabels()){
			ids.add(label.getLabelId());
		}
		this.setLabels(ids);
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
	public List<Long> getLabels() {
		return labels;
	}
	/**
	 * @param labels the labels to set
	 */
	public void setLabels(List<Long> labels) {
		this.labels = labels;
	}
	
}
