package com.desafio.brasilprev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.brasilprev.domain.Requests;
import com.desafio.brasilprev.services.CrudService;
import com.desafio.brasilprev.services.RequestsServices;

@RestController
@RequestMapping("/rest/requests")
public class RequestsController extends CrudController<Requests, Long> {

    private RequestsServices service;

    @Override
    protected CrudService<Requests, Long> getService() {
        return service;
    }
    

}