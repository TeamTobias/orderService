package com.tobias.orderservice.outer.repository;


import com.tobias.orderservice.inner.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByUserid(long userid);

    void deleteById(long orderid);





}
