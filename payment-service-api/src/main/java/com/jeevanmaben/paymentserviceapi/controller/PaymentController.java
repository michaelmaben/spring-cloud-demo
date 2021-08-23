package com.jeevanmaben.paymentserviceapi.controller;

import com.jeevanmaben.paymentserviceapi.domain.Payment;
import com.jeevanmaben.paymentserviceapi.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment/api")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment){
        return new ResponseEntity<Payment>(paymentService.makePayment(payment), HttpStatus.CREATED);
    }
}
