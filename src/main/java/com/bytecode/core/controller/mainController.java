package com.bytecode.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

	@GetMapping("/")
	public String main() {
		System.out.println("mensajeeeee");
		return "mensaje";
	}
}
