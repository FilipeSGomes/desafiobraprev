package com.desafio.brasilprev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

	public Client findByFirstName(String name);
}
