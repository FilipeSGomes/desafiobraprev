package com.desafio.brasilprev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.brasilprev.domain.Products;
import com.desafio.brasilprev.services.CrudService;
import com.desafio.brasilprev.services.ProductsServices;

@RestController
@RequestMapping("/rest/products")
public class ProductsController extends CrudController<Products, Long> {

	@Autowired
    private ProductsServices service;

    @Override
    protected CrudService<Products, Long> getService() {
        return service;
    }
    

}