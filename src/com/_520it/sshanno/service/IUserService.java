package com._520it.sshanno.service;

import java.util.List;

import com._520it.sshanno.domain.User;

public interface IUserService {
	void save(User u);
	List<User> list();
}
