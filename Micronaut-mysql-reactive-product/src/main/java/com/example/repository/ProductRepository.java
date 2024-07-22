package com.example.repository;

import com.example.entity.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;

@Repository
public interface ProductRepository extends ReactorCrudRepository<Product, Integer> {
}
