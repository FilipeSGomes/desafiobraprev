package com.desafio.brasilprev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	public List<Client> findByFirstName(String name);
	public Client findByLogin(String login);
	public Client findByMail(String mail);


}
