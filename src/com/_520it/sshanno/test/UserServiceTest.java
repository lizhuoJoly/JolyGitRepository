package com._520it.sshanno.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com._520it.sshanno.domain.User;
import com._520it.sshanno.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserServiceTest {
	@Autowired
	IUserService userService;
	@Test
	public void testAddUser() {
		User u=new User();
		u.setUsername("joly");
		u.setAge(18);
		userService.save(u);
	}
	@Test
	public void testList() {
		List<User> list = userService.list();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
