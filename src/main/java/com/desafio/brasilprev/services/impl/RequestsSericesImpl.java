package com.desafio.brasilprev.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.desafio.brasilprev.domain.Requests;
import com.desafio.brasilprev.repository.RequestsRepository;
import com.desafio.brasilprev.services.RequestsServices;

@Service
public class RequestsSericesImpl extends CrudServicesImpl<Requests, Long> implements RequestsServices {
	@Autowired
	private RequestsRepository repository;

	@Override
	protected JpaRepository<Requests, Long> getData() {
		return repository;
	}
}
