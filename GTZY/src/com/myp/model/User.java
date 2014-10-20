package com.myp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	private int id;
	private int userId;
	private String userName;
	private String password;
	private String nikeName;
	private int dept;
	private Date joinTime;
	private String description;

	public User() {
		super();
	}

	public User(int id, int userId, String userName, String password,
			String nikeName, int dept, Date joinTime, String description) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.nikeName = nikeName;
		this.dept = dept;
		this.joinTime = joinTime;
		this.description = description;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNikeName() {
		return nikeName;
	}

	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", useName="
				+ userName + ", password=" + password + ", nikeName="
				+ nikeName + ", dept=" + dept + ", joinTime=" + joinTime
				+ ", description=" + description + "]";
	}
}
