package com.jeevanmaben.paymentserviceapi.service;

import com.jeevanmaben.paymentserviceapi.domain.Payment;
import com.jeevanmaben.paymentserviceapi.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {


    @Autowired
    private final PaymentRepository paymentRepository;

    PaymentService(PaymentRepository paymentRepository){
        this.paymentRepository = paymentRepository;
    }

    public Payment makePayment(Payment payment){
        payment.setTransactionId(createTxId());
        System.out.println("Payment****: " + payment);
        return paymentRepository.save(payment);
    }

    public Payment getPaymentDetailsForOrder(Long orderId){
        return paymentRepository.findPaymentByOrderId(orderId).orElseThrow(
                ()-> new RuntimeException("Payment details not found for order " + orderId)
        );
    }

    private UUID createTxId(){
        return UUID.randomUUID();
    }
}
