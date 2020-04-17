package com.desafio.brasilprev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {


}
