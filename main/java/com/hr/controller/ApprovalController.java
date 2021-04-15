package com.hr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hr")
public class ApprovalController {
	@RequestMapping("/approval")
	public String welcome(Model model) {
		model.addAttribute("hi","안녕하세요");
		return "approval";
	}
}
