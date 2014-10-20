package com.myp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept")
public class Dept {
	private int id;
	private String deptName;
	private int createrId;
	private Date createTime;
	private String description;

	public Dept() {
		super();
	}

	public Dept(int id, String deptName, int createrId, Date createTime,
			String description) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.createrId = createrId;
		this.createTime = createTime;
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

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getCreaterId() {
		return createrId;
	}

	public void setCreaterId(int createrId) {
		this.createrId = createrId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "DeptDao [id=" + id + ", deptName=" + deptName + ", createrId="
				+ createrId + ", createTime=" + createTime + ", description="
				+ description + "]";
	}
}
