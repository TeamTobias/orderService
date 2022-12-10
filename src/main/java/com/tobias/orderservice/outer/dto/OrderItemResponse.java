package com.tobias.orderservice.outer.dto;

import com.tobias.orderservice.inner.domain.standardType.PurchaseConfirm;
import lombok.Data;

@Data
public class OrderItemResponse {

	private long id;
	private long brandid;
	private String brandname;
	private long catalogid;
	private int quantity;
	private String name;
	private String color;
	private int size;
	private int unit_price;
	private PurchaseConfirm purchaseConfirm;
	public OrderResponse m_OrderResponse;


}