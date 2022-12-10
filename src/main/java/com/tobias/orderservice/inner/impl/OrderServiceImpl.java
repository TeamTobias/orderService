package com.tobias.orderservice.inner.impl;


import com.tobias.orderservice.inner.service.OrderService;
import com.tobias.orderservice.outer.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

	private final OrderRepository orderRepository;

	public void orderRequest(OrderRequest orderRequest){

	}

	/**
	 * 
	 * @param userid
	 */
	public List<OrderResponse> orderResponse(long userid){
		return null;
	}

	/**
	 * 
	 * @param orderid
	 */
	public void orderDelete(long orderid){

	}

	/**
	 * 
	 * @param catalogname
	 */
	public List<OrderResponse> orderSearchRequest(String catalogname){
		return null;
	}

	/**
	 * 
	 * @param orderitemid
	 */
	public void purchaseConfirmRequest(long orderitemid){

	}

}