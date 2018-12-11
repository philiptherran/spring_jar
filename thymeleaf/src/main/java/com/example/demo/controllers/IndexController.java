package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/")
	public String saludo(Model model) {
		model.addAttribute("mensaje", "Thymeleaf app");
		return "saludo";
	}
}
