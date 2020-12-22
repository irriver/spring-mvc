package kr.ac.study.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@RequestMapping(path = "/userform", method = RequestMethod.GET)
	public String showUserForm() {
		return "userForm";
	}
	
	@PostMapping("/regist")
	public String register(
			@RequestParam(name = "name", required = true) String name,
			@RequestParam(name = "email", required = true) String email,
			@RequestParam(name = "age", required = true) int age,
				ModelMap modelMap) {
		
		modelMap.addAttribute("name", name);
		modelMap.addAttribute("email", email);
		modelMap.addAttribute("age", age);
		return "regist";
	}
}
