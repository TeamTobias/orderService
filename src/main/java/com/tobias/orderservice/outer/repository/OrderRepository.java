package com.tobias.orderservice.outer.repository;


import com.tobias.orderservice.inner.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
