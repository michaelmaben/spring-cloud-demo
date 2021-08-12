package com.jeevanmaben.orderserviceapi;

import com.jeevanmaben.orderserviceapi.domain.Customer;
import com.jeevanmaben.orderserviceapi.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.BDDAssertions.then;

@DataJpaTest
public class CustomerRepositoryTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void getAllCustomers(){
        //given
        Customer savedCustomer = new Customer(1L);
        customerRepository.save(savedCustomer);
        //when
        Customer customer = customerRepository.getById(savedCustomer.getId());
        //then
        then(customer).isEqualTo(savedCustomer);
    }
}
