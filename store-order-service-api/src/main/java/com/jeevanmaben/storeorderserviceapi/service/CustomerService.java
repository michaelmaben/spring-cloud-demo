package com.jeevanmaben.storeorderserviceapi.service;

import com.jeevanmaben.storeorderserviceapi.domain.Customer;
import com.jeevanmaben.storeorderserviceapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Customer> getCustomer(Long id){
        return customerRepository.findById(id);
    }
}
