package org.creatorstore.creatorstore.repositories;


import org.creatorstore.creatorstore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
