package com.example.myboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.myboard.service.UserService;
import com.example.myboard.service.impl.UserServiceimpl;


@Controller
public class BoardController {
	
	private UserServiceimpl userservice;

	@GetMapping("/")		// localhost:8080/		로 이동하면 실행하는 함수
	public String boardPage(Model model) {
		
		return "index";		// index.html 로 이동
	}
}

// .model
// .repository
// .service
// .service.impl