package com.desafio.brasilprev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Requests;

@Repository
public interface RequestsRepository extends JpaRepository<Requests, Long> {


}
