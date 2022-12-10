package com.tobias.orderservice.outer.repository;

import com.tobias.orderservice.inner.domain.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {

}