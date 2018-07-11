package com.java.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.java.entity.User;


public class UserDaoImpl implements UserDao {

	//得到hibernateTemplate对象
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	//添加操作
	public void add() {
		
		User user = new User();
		user.setUsername("rose");
		user.setAddress("japan");
		
		//调用save方法实现添加
		hibernateTemplate.save(user);
		
		
	}

	
}



