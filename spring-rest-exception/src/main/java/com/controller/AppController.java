package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.model.Users;
import com.service.UserService;

@RestController
@RequestMapping("/mainapp")
public class AppController {
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/loadusers")
	public Users loadUsers(
			@RequestHeader(name = "X-COM-PERSIST",required = true)String hdata,
			@RequestHeader(name = "X-COM-LOCATION",defaultValue = "ASIA")String loc			
			) 
	{
		return userService.loadAll();
	}
	
	
}
