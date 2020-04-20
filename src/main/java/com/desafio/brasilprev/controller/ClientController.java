package com.desafio.brasilprev.controller;

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
import com.desafio.brasilprev.services.CrudService;

@RestController
@RequestMapping("/rest/client")
public class ClientController extends CrudController<Client, Long> {

	@Autowired
	private ClientServices services;

	@Override
	protected CrudService<Client, Long> getService() {
		return services;
	}

	@PostMapping("/")
	public Client registerClient(@RequestBody final Client client) {
		return services.registerClient(client);
	}

	@PutMapping("/")
	public Client changeClient(@RequestBody final Client client) {
		return services.changeClient(client);
	}

	@DeleteMapping("/")
	public void deleteClient(@RequestParam final String login) {
		services.deleteClient(login);
	}

	@GetMapping
	public Iterable<Client> loadAllClient() {
		return services.loadAllClient();
	}

	@GetMapping("/")
	public Client loadClientByLogin(@RequestParam String login) {
		return services.loadClientByLogin(login);
	}
}