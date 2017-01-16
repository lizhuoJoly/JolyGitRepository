package com._520it.sshanno.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com._520it.sshanno.dao.IUserDAO;
import com._520it.sshanno.domain.User;
import com._520it.sshanno.service.IUserService;
@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDAO userDAO;
	@Override
	public void save(User u) {
		userDAO.save(u);
	}
	@Override
	//@Transactional(readOnly=true)
	public List<User> list() {
		return userDAO.list();
	}

}
