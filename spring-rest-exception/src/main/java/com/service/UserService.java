package com.service;

import org.springframework.stereotype.Service;

import com.model.User;
import com.model.Users;

@Service
public class UserService {
	private static Users users = new Users();
	
	static {
		users.getUsers().add(new User("admin", "admin123", "admin@mail.com", "pune"));
		users.getUsers().add(new User("manager", "manager123", "manager@mail.com", "pune"));
	}
	
	public Users loadAll() {
		return users;
	}
}
