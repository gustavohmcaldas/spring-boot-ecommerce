package com.gustavohmcaldas.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavohmcaldas.ecommerce.entity.Product;

//@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
