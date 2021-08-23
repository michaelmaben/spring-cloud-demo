package com.jeevanmaben.storeorderserviceapi.service;

import com.jeevanmaben.storeorderserviceapi.domain.CustomerOrder;
import com.jeevanmaben.storeorderserviceapi.domain.Payment;
import com.jeevanmaben.storeorderserviceapi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    public CustomerOrder createOrder(CustomerOrder customerOrder){
        CustomerOrder order = orderRepository.save(customerOrder);
        Payment payment = new Payment(1234.00, order.getId());
        restTemplate.postForObject(
                "http://PAYMENT-SERVICE/payments/api/pay", payment, Payment.class);
        return order;
    }

}
