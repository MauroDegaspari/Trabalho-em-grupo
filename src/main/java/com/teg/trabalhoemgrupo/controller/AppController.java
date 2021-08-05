package com.teg.trabalhoemgrupo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/teste")
	public String App() {
		return "page/teste";
	}
}
