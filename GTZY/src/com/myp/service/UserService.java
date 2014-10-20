package com.myp.service;

import java.util.List;

import com.myp.model.User;

public interface UserService {
	List<User> findAll();

	List<User> findWithPage(int page, int rows);

	List<User> findWithPageAndCondition(String Bt, String nd, String position,
			String wh, String mj, String flh, String Bgqx, String ajh,
			String jh, String startTime, String endTime, int page, int rows);

	int getRows();

	int getRowsWithCondition(String Bt, String nd, String position, String wh,
			String mj, String flh, String Bgqx, String ajh, String jh,
			String startTime, String endTime);

	void delete(User user);

	void add(User user);

	void update(User user);

	User login(User user);
}
