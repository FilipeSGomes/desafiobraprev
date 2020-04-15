package com.desafio.brasilprev.controller;

import java.util.List;

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

	@PostMapping("/register")
	public Client registerClient(@RequestBody final Client cliente) {
		return cliente;
	}
	
	@PutMapping("/change")
	public Client changeClient(@RequestBody final String hello) {
		return null;
	}
	@DeleteMapping("/delete")
	public void deleteClient(@RequestBody final String hello) {
	}
	
	@GetMapping
	public List<Client> loadClient(){
		
		return null;
	}
	
}