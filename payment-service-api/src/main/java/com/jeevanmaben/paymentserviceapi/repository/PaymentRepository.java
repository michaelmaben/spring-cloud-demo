package com.jeevanmaben.paymentserviceapi.repository;

import com.jeevanmaben.paymentserviceapi.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment getPaymentById(Long id);
}
