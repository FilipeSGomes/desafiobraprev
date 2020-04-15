package com.desafio.brasilprev.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.brasilprev.domain.Client;

@RestController
@RequestMapping("/rest/client")
public class ClientController {

	@PostMapping("/CadastroCliente")
	public Client hellotadd(@RequestBody final Client cliente) {
		return cliente;
	}
	
	@PutMapping("/put")
	public String helloput(@RequestBody final String hello) {
		return hello;
	}
	@DeleteMapping("/Delete")
	public void helloDel(@RequestBody final String hello) {
	}
}