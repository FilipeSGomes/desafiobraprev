package com.desafio.brasilprev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Requests;

@Repository
public interface RequestsRepository extends CrudRepository<Requests, Long> {

}
