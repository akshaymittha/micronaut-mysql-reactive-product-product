package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller("/product")
public class ProductController {

    @Inject
    ProductService productService;

    @Post("/save")
    public Mono<Product> saveProduct(@Body Product product) {
        return productService.create(product);
    }

    @Get("/show/{productId}")
    public Mono<Product> findProductById(@PathVariable Integer productId) {
        return productService.findProductById(productId);
    }

    @Get("/show")
    public Flux<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @Put("/update")
    public Mono<Product> updateProduct(@Body Product product) {
        return productService.updateProduct(product);
    }

    @Delete("/delete/{productId}")
    public Mono<Long> deleteProductById(@PathVariable Integer productId) {
        return productService.deleteProductById(productId);
    }
}
