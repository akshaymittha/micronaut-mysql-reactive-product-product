package com.example.service;

import com.example.entity.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    Mono<Product> create(Product product);

    Mono<Product> findProductById(Integer productId);

    Flux<Product> findAllProducts();

    Mono<Product> updateProduct(Product product);

    Mono<Long> deleteProductById(Integer productId);

}
