package com.example.myboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.myboard.service.UserService;


@Controller
public class BoardController {
	
	private UserService userservice;
	
	public BoardController(UserService userservice) {
		this.userservice = userservice;
	}

	@GetMapping("/")		// localhost:8080/		로 이동하면 실행하는 함수
	public String boardPage(Model model) {
		model.addAttribute("user", userservice.getAllUser());
		return "index";		// index.html 로 이동
	}
	@GetMapping("/edit/{id}")		
	public String editPage(Model model/*, @PathVariable Long id*/) {
		//model.addAllAttributes("user", userService.getUserById(id));
		return "edit";			// edit.html
	}
}
// .model
// .repository
// .service
// .service.impl