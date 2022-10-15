package com.icacentre.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String getHome() {
		return "Home Page";
	}
	@GetMapping("/getMsg")
	public String getMsg() {
		return "Hello! This is msg from my side";
	}
}
