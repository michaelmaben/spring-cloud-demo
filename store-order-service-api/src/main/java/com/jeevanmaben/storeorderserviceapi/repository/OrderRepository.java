package com.jeevanmaben.storeorderserviceapi.repository;

import com.jeevanmaben.storeorderserviceapi.domain.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
}
