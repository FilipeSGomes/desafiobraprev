package com.desafio.brasilprev.services;

import java.util.List;

import com.desafio.brasilprev.domain.Client;

public interface ProductsServices {

	public Client changeClient(Client client);
	
	public Client registerClient(Client client);
	
	public void deleteClient(String login);
	
	public Iterable<Client> loadAllClient();
	
	public List<Client> loadClient(String firstName);
	
	public Client loadClientByLogin(String login);
}
