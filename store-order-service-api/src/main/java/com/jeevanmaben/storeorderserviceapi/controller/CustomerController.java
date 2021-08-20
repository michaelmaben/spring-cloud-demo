package com.jeevanmaben.storeorderserviceapi.controller;

import com.jeevanmaben.storeorderserviceapi.domain.Customer;
import com.jeevanmaben.storeorderserviceapi.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders/api")
public class CustomerController {
    @Autowired
    private final CustomerService customerService;

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id){
        Optional<Customer> customer = customerService.getCustomer(id);
        return customer.map(c-> ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound().build());
    }
}
