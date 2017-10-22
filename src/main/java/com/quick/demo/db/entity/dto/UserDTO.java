/**
 * 
 */
package com.quick.demo.db.entity.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author huicha
 *
 */
public class UserDTO {

	private Long userId;
	private String firstName;
	private String lastName;
	private String nick;
	private Date birthday;
	private Date creationDate;
	private Set<DemoDTO> demos = new HashSet<DemoDTO>(0);
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}
	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the demos
	 */
	public Set<DemoDTO> getDemos() {
		return demos;
	}
	/**
	 * @param demos the demos to set
	 */
	public void setDemos(Set<DemoDTO> demos) {
		this.demos = demos;
	}
	
}
