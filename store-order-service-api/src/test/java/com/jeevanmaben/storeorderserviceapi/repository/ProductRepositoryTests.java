package com.jeevanmaben.storeorderserviceapi.repository;

import com.jeevanmaben.storeorderserviceapi.domain.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.BDDAssertions.then;

@DataJpaTest
@ExtendWith(SpringExtension.class)

public class ProductRepositoryTests {
    @Autowired
    ProductRepository productRepository;

    @Test
    void getProducts(){
        //given
        Product savedProduct = productRepository.save(new Product(1L, "Microwave"));
        //when
        Optional<Product> product = productRepository.getByName(savedProduct.getName());
        //then
        Product p = product.orElseThrow();
        then(p).isEqualTo(savedProduct);
    }
}
