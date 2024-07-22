package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Singleton
public class ProductServiceImpl implements ProductService {

    @Inject
    ProductRepository productRepository;


    @Override
    public Mono<Product> create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Mono<Product> findProductById(Integer productId) {
        return productRepository.findById(productId);
    }


    @Override
    public Flux<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Mono<Product> updateProduct(Product product) {
        return productRepository.update(product);
    }

    @Override
    public Mono<Long> deleteProductById(Integer productId) {
        return productRepository.deleteById(productId);
    }

}
