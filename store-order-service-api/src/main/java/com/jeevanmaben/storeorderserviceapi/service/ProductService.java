package com.jeevanmaben.storeorderserviceapi.service;

import com.jeevanmaben.storeorderserviceapi.domain.Product;
import com.jeevanmaben.storeorderserviceapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product createProduct(Product product){
        return productRepository.save(product);
    }
}
