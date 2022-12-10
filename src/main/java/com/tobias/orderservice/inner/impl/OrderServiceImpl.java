package com.tobias.orderservice.inner.impl;


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

	}

	@Override
	public List<OrderResponse> orderResponse(long userid) {
		return null;
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