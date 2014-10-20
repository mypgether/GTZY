//package com.myp.model;
//
//import java.sql.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "user")
//public class CopyOfUser {
//	private int id;
//	private int userId;
//	private String userName;
//	private String password;
//	private String nikeName;
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "fk_e_e")
//	private Dept dept;
//	private Date joinTime;
//	private String description;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getNikeName() {
//		return nikeName;
//	}
//
//	public void setNikeName(String nikeName) {
//		this.nikeName = nikeName;
//	}
//
//	public Dept getDept() {
//		return dept;
//	}
//
//	public void setDept(Dept dept) {
//		this.dept = dept;
//	}
//
//	public Date getJoinTime() {
//		return joinTime;
//	}
//
//	public void setJoinTime(Date joinTime) {
//		this.joinTime = joinTime;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//}
