package com.cssl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cssl.pojo.Users;
import com.cssl.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersService service;
	
	@RequestMapping("/login")
	public String index(Model model) {
		System.out.println("login");
		model.addAttribute("user", "admin");
		return "forward:/login.jsp";
	}
	
	@RequestMapping("/regist")
	public String regist(Users user) {
		System.out.println("regist:"+user.getUsername());
		if(service.saveUsers(user)) {
			return "success";
		}
		return "redirect:/index.html";
	}

}
