/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author cristianhuichaqueo
 *
 */
public class PendingDemo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4087822449204235094L;
	
	private String artistEmail;
	private List<String> labels;
	
	/**
	 * @return the artistEmail
	 */
	public String getArtistEmail() {
		return artistEmail;
	}
	/**
	 * @param artistEmail the artistEmail to set
	 */
	public void setArtistEmail(String artistEmail) {
		this.artistEmail = artistEmail;
	}
	/**
	 * @return the sendersEmails
	 */
	public List<String> getLabelsNames() {
		return labels;
	}
	/**
	 * @param sendersEmails the sendersEmails to set
	 */
	public void setLabelsNames(List<String> names) {
		this.labels = names;
	}

}
