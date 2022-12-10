package com.tobias.orderservice.outer.dto;

import lombok.Data;

@Data
public class OrderItemRequest {

	private long brandid;
	private String brandname;
	private long catalogid;
	private String name;
	private int quantity;
	private String color;
	private int size;
	private int unit_price;
	public OrderRequest m_OrderRequest;

}