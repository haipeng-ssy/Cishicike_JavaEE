package com.haipeng.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2014.11.12
 * */
@Controller

public class LoginController {
     
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model){
		String username = request.getParameter("username");
		if(username.equals("haipeng"))
		{
			model.addAttribute("msg", "success");
			return "loginSuccess";
		}
		else{
			return "index";
		}
	}
}
