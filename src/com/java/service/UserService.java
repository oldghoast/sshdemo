package com.java.service;

import org.springframework.transaction.annotation.Transactional;

import com.java.dao.UserDao;
import com.java.dao.UserDaoImpl;


@Transactional
public class UserService {

	//注入dao对象
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add() {
		System.out.println("service........");
		userDao.add();
	}
}
