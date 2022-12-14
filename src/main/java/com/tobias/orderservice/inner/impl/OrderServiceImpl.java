package com.tobias.orderservice.inner.impl;


import com.tobias.orderservice.inner.domain.Order;
import com.tobias.orderservice.inner.service.OrderService;
import com.tobias.orderservice.outer.dto.OrderRequest;
import com.tobias.orderservice.outer.dto.OrderResponse;
import com.tobias.orderservice.outer.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;


	@Override
	public void orderRequest(OrderRequest orderRequest) {
		Order order = new Order(orderRequest);
		orderRepository.save(order);
	}

	@Override
	public List<OrderResponse> orderResponse(long userid) {
		List<Order> orders = orderRepository.findAllById(userid);


	}

	@Override
	public void orderDelete(long orderid) {

	}

	@Override
	public List<OrderResponse> orderSearchRequest(String catalogname) {

		return null;
	}

	@Override
	public void purchaseConfirmRequest(long orderitemid) {

	}
}