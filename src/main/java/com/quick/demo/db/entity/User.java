/**
 * 
 */
package com.quick.demo.db.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author huicha
 *
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8339682158262840560L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long userId;
	@Column(name = "first_name", nullable = false, length = 200)
	private String firstName;
	@Column(name = "last_name", nullable = false, length = 200)
	private String lastName;
	@Column(name = "nick", nullable = false, length = 200)
	private String nick;
	@Column(name = "birthday")
	private Date birthday;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", nullable = false, length = 19)
	private Date creationDate;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "demoId", cascade = CascadeType.PERSIST)
	private Set<Demo> demos = new HashSet<Demo>(0);
	
	public User() {
		this.creationDate = new Date();
	}
	
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
	public Set<Demo> getDemos() {
		return demos;
	}
	/**
	 * @param demos the demos to set
	 */
	public void setDemos(Set<Demo> demos) {
		this.demos = demos;
	}
	
}
