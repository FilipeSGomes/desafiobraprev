package com.desafio.brasilprev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.brasilprev.domain.Products;
import com.desafio.brasilprev.services.ProductsServices;

@RestController
@RequestMapping("/rest/products")
public class ProductsController {

	@Autowired
	private ProductsServices services;

	@PostMapping("/register")
	public Products registerProducts(@RequestBody final Products Products) {
		return services.registerProducts(Products);
	}

	@PutMapping("/change")
	public Products changeProducts(@RequestBody final Products Products) {
		return services.changeProducts(Products);
	}

	@DeleteMapping("/delete")
	public void deleteProducts(@RequestParam final String login) {
		services.deleteProducts(login);
	}

	@GetMapping
	public Iterable<Products> loadAllProducts() {
		return services.loadAllProducts();
	}


}