package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")

public class MenberController {

	@RequestMapping("")
	public String index() {
		return "member";
	}

}
