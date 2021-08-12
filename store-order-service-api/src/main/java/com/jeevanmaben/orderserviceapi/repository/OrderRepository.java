package com.jeevanmaben.orderserviceapi.repository;

import com.jeevanmaben.orderserviceapi.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
