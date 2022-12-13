package com.tobias.orderservice.outer.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderItemRequest {

	private long brandid;
	private String brandname;
	private long catalogid;
	private String name;
	private int quantity;
	private String color;
	private int size;
	private int unitPrice;
//	private List<OrderRequest> orderRequestList;

}