package com.jeevanmaben.storeorderserviceapi.controller;

import com.jeevanmaben.storeorderserviceapi.domain.CustomerOrder;
import com.jeevanmaben.storeorderserviceapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<CustomerOrder> createOrder(@RequestBody CustomerOrder customerOrder){
        return new ResponseEntity<>(orderService.createOrder(customerOrder), HttpStatus.CREATED) ;
    }
}
