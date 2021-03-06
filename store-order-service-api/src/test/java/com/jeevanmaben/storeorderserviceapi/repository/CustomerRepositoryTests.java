package com.jeevanmaben.storeorderserviceapi.repository;

import com.jeevanmaben.storeorderserviceapi.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.BDDAssertions.then;

@DataJpaTest
@RequiredArgsConstructor
public class CustomerRepositoryTests {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    TestEntityManager testEntityManager;

    @Test
    void getCustomer(){
        //given
        Customer savedCustomer = testEntityManager.persist(new Customer(null,"Online"));
        //when
        Optional<Customer> customer = customerRepository.findById(savedCustomer.getId());
        //then
        then(customer.get()).isEqualTo(savedCustomer);
    }
}
