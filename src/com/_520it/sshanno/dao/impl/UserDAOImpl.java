package com._520it.sshanno.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com._520it.sshanno.dao.IUserDAO;
import com._520it.sshanno.domain.User;
@Repository
public class UserDAOImpl implements IUserDAO {
	@Resource
	private SessionFactory sessionFactory;
	@Override
	public void save(User u) {
		Session session = sessionFactory.getCurrentSession();
		session.save(u);
	}
	@Override
	public List<User> list() {
		Session session = sessionFactory.getCurrentSession();
		List<User> list = session.createQuery("SELECT u from User u").list();
		return list;
	}

}
