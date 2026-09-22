package org.creatorstore.creatorstore.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.creatorstore.creatorstore.entities.Product;
import org.creatorstore.creatorstore.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;  //dependency injection through "CONSTRUCTOR INJECTION"

    public Product createProduct(@Valid @RequestBody Product product){
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @Valid @RequestBody Product product){

        return product;
    }


    @GetMapping
    public List<Product>getProduct(){

        return List.of();
    }


    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){

    }

}
