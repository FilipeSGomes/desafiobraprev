package com.desafio.brasilprev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class IndexController {

	public String index() {
		return "Digite: swaager-ui.html";
	}
	
}
