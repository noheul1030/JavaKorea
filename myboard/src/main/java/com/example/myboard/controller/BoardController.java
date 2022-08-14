package com.example.myboard.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.myboard.model.User;
import com.example.myboard.service.UserService;


@Controller
public class BoardController {
	
	private UserService userService;
	
	public BoardController(UserService userservice) {
		super();
		this.userService = userservice;
	}

	@GetMapping("/")		// localhost:8080/		로 이동하면 실행하는 함수
	public String boardPage(Model model) {
//		model.addAttribute("user", userService.getAllUser());
//		return "index";		// index.html 로 이동
		return findPaginated(1, model);
	}
	@GetMapping("/edit/{id}")		
	public String editPage(Model model, @PathVariable Long id) {
		model.addAttribute("user", userService.getUserById(id));
		return "edit";			// edit.html
	}
	
	@PostMapping("/")
	public String saveUser(@ModelAttribute("User") User user) {
		userService.saveUser(user);
		return "redirect:/";			// 입력완료 후 localhost:8089/ 로 이동
	}
	
	// GetMapping : 페이지 이동
	// PostMapping : 무언가를 입력받아서 정보를 숨기고 페이지 이동
	// Model model : html로 넘겨줄 값
	// @PathVariable : html로부터 받을 값
	// @ModelAttribute : html에서 입력한 값
	
	@PostMapping("/{id}")
	public String updateUser(@PathVariable Long id, 
			@ModelAttribute("user") User user, Model model ) {
		// 받은 id를 통해서 mysql에서 정보를 가져옴
		User dbUser = userService.getUserById(id);
		dbUser.setId(id);
		dbUser.setFirst_name(user.getFirst_name());
		dbUser.setLast_name(user.getLast_name());
		dbUser.setEmail(user.getEmail());
		
		// userService 업데이트
		userService.updateUser(dbUser);
		return "redirect:/";			// localhost:8089/ 로 돌아감
	}
	
	@GetMapping("/new")					// localhost:new/ 로 이동하면
	public String registerUser(Model model) {
		// Model model : html에 java값을 전달할 수 있는 객체(변수)
		User user = new User();
		model.addAttribute("user",user);      	// 변수명 "user", 전달값 user -> html로
		return "new";				// new.html을 열어라
	}
	
	@GetMapping("/{id}")	
	public String deleteUser(@PathVariable Long id) {
		userService.deleteUserById(id);
		return "redirect:/";
	}
	
	// 페이지 나누기
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value="pageNo") int pageNo, Model model) {
		// @GetMapping : html의 href와 연결
		// @PathVariable : html의 URL에서 전달한 값을 받음
		int pageSize = 5; 			// 한 페이지에 보여주고 싶은 갯수를 숫자로 입력
		Page<User> page = userService.findPaginated(pageNo, pageSize);
		List<User> listUsers = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("user", listUsers);
		
			
		
		return "index";			// index.html 실행
	}
}
// .model
// .repository
// .service
// .service.impl