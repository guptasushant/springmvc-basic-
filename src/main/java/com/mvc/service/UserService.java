package com.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.UserDao;
import com.mvc.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao dao;

	public int createUser(User user) {
		return this.dao.saveUser(user);
	}
}
