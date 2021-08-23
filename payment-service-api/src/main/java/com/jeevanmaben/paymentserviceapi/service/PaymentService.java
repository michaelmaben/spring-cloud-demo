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
        return paymentRepository.save(payment);
    }

    private UUID createTxId(){
        return UUID.randomUUID();
    }
}
