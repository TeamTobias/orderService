package com.tobias.orderservice.outer.repository;

import com.tobias.orderservice.inner.domain.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {

    List<OrderInfo> findAllByUserid(long userid);
}