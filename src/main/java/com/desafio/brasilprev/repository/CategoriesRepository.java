package com.desafio.brasilprev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {


}
