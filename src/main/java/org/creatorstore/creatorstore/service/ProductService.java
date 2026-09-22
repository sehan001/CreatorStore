package org.creatorstore.creatorstore.service;


import org.creatorstore.creatorstore.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public Product createProduct(Product product) {
        return null;
    }

    public Product updateProduct(Long id, Product product) {
        return product;
    }

    public List<Product> getProduct() {
        return List.of();
    }

    public Product getProductById(Long id) {
        return null;
    }

    public void deleteProduct(Long id) {

    }
}
