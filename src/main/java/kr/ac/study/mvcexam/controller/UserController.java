package kr.ac.study.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.study.mvxexam.dto.User;

@Controller
public class UserController {
	
	@RequestMapping(path = "/userform", method = RequestMethod.GET)
	public String showUserForm() {
		return "userForm";
	}
	
	@RequestMapping(path = "/regist", method = RequestMethod.POST)
	/* @ModelAttribute를 사용해서 넘겨받은 데이터를 User타입 Dto 객체에 저장*/
	public String register(@ModelAttribute User user) {
		System.out.println("User Informations");
		System.out.println(user);
		return "regist";
	}
}
