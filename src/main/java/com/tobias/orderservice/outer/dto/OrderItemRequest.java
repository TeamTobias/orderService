package com.tobias.orderservice.outer.dto; ����ũ�μ���.order.outer.dto;


/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
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

	public OrderItemRequest(){

	}

	public void finalize() throws Throwable {

	}

}