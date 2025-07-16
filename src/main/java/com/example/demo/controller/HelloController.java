package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.model.UserDetails;

@RestController
public class HelloController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello, World!";
	}

	@GetMapping("/user")
	public List<UserDetails> getUserDetails() {
		List<UserDetails> list = new ArrayList<>();
		list.add(new UserDetails("John Doe", "rs@email.com", "123-456-7890"));
		list.add(new UserDetails("Sharan Doe", "johnrs@email.com", "123-456-7890"));
		list.add(new UserDetails("John Raghu", "jrs@email.com", "123-456-7890"));

		return list;

	}
}