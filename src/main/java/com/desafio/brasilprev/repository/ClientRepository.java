package com.desafio.brasilprev.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

	public List<Client> findByFirstName(String name);
	public Client findByLogin(String login);
}
