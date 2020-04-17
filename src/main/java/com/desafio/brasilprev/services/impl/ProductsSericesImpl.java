package com.desafio.brasilprev.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.desafio.brasilprev.domain.Products;
import com.desafio.brasilprev.repository.ProductsRepository;
import com.desafio.brasilprev.services.ProductsServices;

@Service
public class ProductsSericesImpl extends CrudServicesImpl<Products, Long> implements ProductsServices {
	@Autowired
	private ProductsRepository repository;

	@Override
	protected JpaRepository<Products, Long> getData() {
		return repository;
	}
}
