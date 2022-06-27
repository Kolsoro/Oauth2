package com.samer.secureApp;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}
	 
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout.jsp";
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}
	
}
