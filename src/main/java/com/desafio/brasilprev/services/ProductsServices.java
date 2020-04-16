package com.desafio.brasilprev.services;

import com.desafio.brasilprev.domain.Products;

public interface ProductsServices {

	public Products changeProducts(Products Products);
	
	public Products registerProducts(Products Products);
	
	public void deleteProducts(String login);
	
	public Iterable<Products> loadAllProducts();
	
	
}
