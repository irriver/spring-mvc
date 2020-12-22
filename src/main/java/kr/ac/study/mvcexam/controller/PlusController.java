package kr.ac.study.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlusController {
	
	@GetMapping(path = "/plusform")
	public String plusform() {
		/* 요청이 들어오면 해당 viewName만 반환할 예정 */
		return "plusForm";
	}
	
	@PostMapping(path = "/plus")
	public String plus(
			@RequestParam(name = "val1", required = true) int value1,
			@RequestParam(name = "val2", required = true) int value2,
				ModelMap modelMap) {
		/* modelMap 객체에 request scope 으로 자동으로 매핑*/
		int result = value1 + value2;
		
		modelMap.addAttribute("val1", value1);
		modelMap.addAttribute("val2", value2);
		modelMap.addAttribute("result", result);
		return "plusResult";
	}
}
