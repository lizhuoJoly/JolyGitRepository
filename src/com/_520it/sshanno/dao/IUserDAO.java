package com._520it.sshanno.dao;

import java.util.List;

import com._520it.sshanno.domain.User;

public interface IUserDAO {
	void save(User u);
	List<User> list();
}
