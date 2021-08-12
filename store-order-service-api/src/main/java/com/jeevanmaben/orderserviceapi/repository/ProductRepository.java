package com.jeevanmaben.orderserviceapi.repository;

import com.jeevanmaben.orderserviceapi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
