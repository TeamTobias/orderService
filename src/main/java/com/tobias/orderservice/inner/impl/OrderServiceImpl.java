package com.tobias.orderservice.inner.impl;


import com.tobias.orderservice.inner.domain.Order;
import com.tobias.orderservice.inner.service.OrderService;
import com.tobias.orderservice.outer.dto.OrderRequest;
import com.tobias.orderservice.outer.dto.OrderResponse;
import com.tobias.orderservice.outer.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
		List<Order> orders = orderRepository.findAllByUserid(userid);
		return orders.stream().map(OrderResponse::new).collect(Collectors.toList());
	}

	@Override
	public void orderDelete(long orderid) {
		orderRepository.deleteById(orderid);
	}

	@Override
	public List<OrderResponse> orderSearchRequest(long userid, String catalogname) {
//		List<Order> orders = orderRepository.findAllByUserid(userid);
//		return orders.stream().filter(order -> order.getOrderItems().equals(catalogname)).map(OrderResponse::new).collect(Collectors.toList());
//		return orders.stream().map(OrderResponse::new).collect(Collectors.toList());

		return null;
	}

	@Override
	public void purchaseConfirmRequest(long orderitemid) {


	}
}