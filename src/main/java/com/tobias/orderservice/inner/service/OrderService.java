package com.tobias.orderservice.inner.service;

import com.tobias.orderservice.outer.dto.OrderRequest;
import com.tobias.orderservice.outer.dto.OrderResponse;

import java.util.List;


public interface OrderService {

	 void orderRequest(OrderRequest orderRequest);

	 List<OrderResponse> orderResponse(long userid);

	 void orderDelete(long orderid);

	 List<OrderResponse> orderSearchRequest(long userid, String catalogname);

	 void purchaseConfirmRequest(long orderitemid);

}