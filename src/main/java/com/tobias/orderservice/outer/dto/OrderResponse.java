package com.tobias.orderservice.outer.dto;

import com.tobias.orderservice.inner.domain.standardType.OrderStatus;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderResponse {

	private long id;
	private Date createdAt;
	private int totalPrice;
	private OrderStatus orderStatus;
	private List<OrderItemResponse> orderItemResponseList;

}