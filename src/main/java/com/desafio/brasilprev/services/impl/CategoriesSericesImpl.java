package com.desafio.brasilprev.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.desafio.brasilprev.domain.Categories;
import com.desafio.brasilprev.repository.CategoriesRepository;
import com.desafio.brasilprev.services.CategoriesServices;

@Service
public class CategoriesSericesImpl extends CrudServicesImpl<Categories, Long> implements CategoriesServices {
	@Autowired
	private CategoriesRepository repository;

	@Override
	protected JpaRepository<Categories, Long> getData() {
		return repository;
	}
}
