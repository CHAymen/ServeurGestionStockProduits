package com.example.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControler {
	@RequestMapping("/api/user")
	public Principal user (Principal user) {
		return user;
	}
}
