package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	// http://localhost:8080 -> / (root)
	@RequestMapping("/")
	public String home() {
		return "home"; 
		// home.jsp를 return 하세요오
		///WEB-INF/views/home.jsp
	}
}
