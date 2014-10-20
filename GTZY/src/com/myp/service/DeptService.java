package com.myp.service;

import java.util.List;

import com.myp.model.Dept;

public interface DeptService {
	List<Dept> findAll();

	List<Dept> findWithPage(int page, int rows);

	List<Dept> findWithPageAndCondition(String deptName, int page, int rows);

	int getRows();

	int getRowsWithCondition(String deptName);

	void delete(Dept dept);

	void add(Dept dept);

	void update(Dept dept);
}
