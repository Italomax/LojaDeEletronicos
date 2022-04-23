package com.g.es.LojaMax.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.g.es.LojaMax.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
