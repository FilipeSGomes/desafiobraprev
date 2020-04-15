package com.desafio.brasilprev.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Categories;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Long> {

}
