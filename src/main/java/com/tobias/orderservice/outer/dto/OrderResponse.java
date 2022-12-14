package com.tobias.orderservice.outer.dto;

import com.tobias.orderservice.inner.domain.Order;
import com.tobias.orderservice.inner.domain.OrderItem;
import com.tobias.orderservice.inner.domain.standardType.OrderStatus;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class OrderResponse {

	private long id;
	private Date createdAt;
	private int totalPrice;
	private OrderStatus orderStatus;
	private Set<OrderItem> orderItemResponseList;

	public OrderResponse(Order order) {
		this.id = order.getId();
		this.createdAt = order.getCreatedAt();
		this.totalPrice = order.getPayVo().getTotalPrice();
		this.orderStatus = order.getPayVo().getOrderStatus();
		this.orderItemResponseList = order.getOrderItems();

	}

}