package com.jeevanmaben.paymentserviceapi.repository;

import com.jeevanmaben.paymentserviceapi.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment getPaymentById(Long orderId);

    public Optional<Payment> findPaymentByOrderId(Long orderId);
}
