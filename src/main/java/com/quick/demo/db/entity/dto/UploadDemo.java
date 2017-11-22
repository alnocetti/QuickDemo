/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author huicha
 *
 */
public class UploadDemo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5359771507746521764L;

	private Artist artist;
	private Demo demo;
	private List<Label> labels;
	
	/**
	 * @return the artist
	 */
	public Artist getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	/**
	 * @return the demo
	 */
	public Demo getDemo() {
		return demo;
	}
	/**
	 * @param demo the demo to set
	 */
	public void setDemo(Demo demo) {
		this.demo = demo;
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
