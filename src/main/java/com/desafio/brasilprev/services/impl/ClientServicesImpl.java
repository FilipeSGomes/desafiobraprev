package com.desafio.brasilprev.services.impl;

import java.util.List;

import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.brasilprev.domain.Client;
import com.desafio.brasilprev.repository.ClientRepository;
import com.desafio.brasilprev.services.ClientServices;

@Service
public class ClientServicesImpl implements ClientServices {

	@Autowired
	private ClientRepository repository;

	@Override
	public Client changeClient(Client client) {
		if (client == null || client.getUsername().isEmpty())
			return null;
		Client changeClient = repository.findByLogin(client.getUsername());
		if (changeClient == null)
			return null;
		return repository.save(client);
	}

	@Override
	public Client registerClient(Client client) {
		if (client == null)
			return null;
		Client registerClient = repository.findByLogin(client.getUsername());
		if (registerClient != null)
			return null;
		return repository.save(client);
	}

	@Override
	public void deleteClient(String login) {
		// TODO Auto-generated method stub
		Client deleteClient = loadClientByLogin(login);
		if (deleteClient == null)
			throw new MessageDescriptorFormatException("Client Not Found");
		repository.delete(deleteClient);
	}

	@Override
	public Iterable<Client> loadAllClient() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Client> loadClient(String firstName) {
		// TODO Auto-generated method stub
		if (firstName == null)
			return null;
		return repository.findByFirstName(firstName);
	}

	@Override
	public Client loadClientByLogin(String login) {
		// TODO Auto-generated method stub
		if (login == null)
			return null;
		return repository.findByLogin(login);
	}

}
