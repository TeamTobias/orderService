package com.tobias.orderservice.outer.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {

	private long userid;
	private int totalPrice;
	private List<OrderItemRequest> orderItemRequests;


}