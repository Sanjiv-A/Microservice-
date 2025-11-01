package com.E_Commerce.Order_service.repository;

import com.E_Commerce.Order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order , Long> {

}
