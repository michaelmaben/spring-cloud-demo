package com.jeevanmaben.storeorderserviceapi.repository;

import com.jeevanmaben.storeorderserviceapi.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
