package com.jeevanmaben.paymentserviceapi.controller;

import com.jeevanmaben.paymentserviceapi.domain.Payment;
import com.jeevanmaben.paymentserviceapi.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments/api")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment){
        return new ResponseEntity<Payment>(paymentService.makePayment(payment), HttpStatus.CREATED);
    }

    @GetMapping("/payment/{orderId}")
    public ResponseEntity<Payment> getPaymentDetailsForOrder(@PathVariable Long orderId){
        return new ResponseEntity<>(paymentService.getPaymentDetailsForOrder(orderId), HttpStatus.FOUND);
    }
}
