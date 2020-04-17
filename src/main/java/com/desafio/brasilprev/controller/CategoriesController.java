package com.desafio.brasilprev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.brasilprev.domain.Categories;
import com.desafio.brasilprev.services.CategoriesServices;
import com.desafio.brasilprev.services.CrudService;

@RestController
@RequestMapping("/rest/categories")
public class CategoriesController extends CrudController<Categories, Long> {

	@Autowired
    private CategoriesServices service;

    @Override
    protected CrudService<Categories, Long> getService() {
        return service;
    }
    

}