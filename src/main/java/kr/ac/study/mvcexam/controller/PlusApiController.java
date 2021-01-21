package kr.ac.study.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.study.mvxexam.dto.PlusResult;

@Controller
public class PlusApiController {
	@GetMapping("/api/plus")
	@ResponseBody
	public PlusResult plus(
			@RequestParam("value1") int value1,
			@RequestParam("value2") int value2) {
		PlusResult newPlusResult = new PlusResult();
		newPlusResult.setValue1(value1);
		newPlusResult.setValue2(value2);
		newPlusResult.setResult(value1 + value2);
		return newPlusResult;
	}
}
