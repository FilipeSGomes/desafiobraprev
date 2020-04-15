package com.desafio.brasilprev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.brasilprev.domain.Client;
import com.desafio.brasilprev.services.ClientServices;

@RestController
@RequestMapping("/rest/products")
public class ProductsController {

	@Autowired
	private ClientServices services;

	@PostMapping("/register")
	public Client registerClient(@RequestBody final Client client) {
		return services.registerClient(client);
	}

	@PutMapping("/change")
	public Client changeClient(@RequestBody final Client client) {
		return services.changeClient(client);
	}

	@DeleteMapping("/delete")
	public void deleteClient(@RequestParam final String login) {
		services.deleteClient(login);
	}

	@GetMapping
	public Iterable<Client> loadAllClient() {
		return services.loadAllClient();
	}

	@GetMapping("/firstName")
	public List<Client> loadClient(@RequestParam String firstName) {
		return services.loadClient(firstName);
	}


	@GetMapping("/login")
	public Client loadClientByLogin(@RequestParam String login) {
		return services.loadClientByLogin(login);
	}
}