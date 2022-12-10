package com.tobias.orderservice.outer.dto; ����ũ�μ���.order.outer.dto;


/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
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

	public OrderItemResponse(){

	}

	public void finalize() throws Throwable {

	}

}