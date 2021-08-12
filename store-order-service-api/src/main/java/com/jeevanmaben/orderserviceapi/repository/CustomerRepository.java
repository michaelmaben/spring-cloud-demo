package com.jeevanmaben.orderserviceapi.repository;

import com.jeevanmaben.orderserviceapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
