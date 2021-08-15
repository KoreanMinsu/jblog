package com.javaex.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userService;
		
	//login form
	@RequestMapping(value="/loginForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String loginForm() {
		System.out.println("UserController.loginForm");
		
		return "/user/loginForm";
	}
	
	//login
	@RequestMapping(value="/login", method = {RequestMethod.GET, RequestMethod.POST})
	public String log(@ModelAttribute UserVo userVo, HttpSession session) {
		System.out.println("UserController.login");
		
		UserVo authUser = userService.getUser(userVo);
		
		if(authUser!=null) {
			System.out.println("[로그인성공]");
			
			session.setAttribute("authUser", authUser);
			return "redirct:/main";
			
		}else {
			System.out.println("[로그인실패]");
			
			return "redirect:/user/loginForm?result=fail";
		}
		
	}
	
	
	//join form
	@RequestMapping(value="/joinForm", method = {RequestMethod.GET, RequestMethod.POST})
	public String joinForm() {
		System.out.println("UserController.joinForm");
		
		return "/user/joinForm";
	}
	
	//join
	@RequestMapping(value="/join", method = {RequestMethod.GET, RequestMethod.POST})
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("UserController.join");
		
		System.out.println(userVo.toString());
		
		return "/user/joinSuccess";
	}
	
	//logout
		@RequestMapping(value="/logout", method = { RequestMethod.GET, RequestMethod.POST })
		public String logout(HttpSession session) {
			
			session.removeAttribute("authUser");
			session.invalidate();
			
			return "redirect:/main";
		}
	
	
}
