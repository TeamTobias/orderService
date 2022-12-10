package com.tobias.orderservice.outer.dto; ����ũ�μ���.order.outer.dto;


/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public class OrderRequest {

	private long userid;
	private int totalPrice;
	private List<OrderItemRequest> orderItemRequests;

	public OrderRequest(){

	}

	public void finalize() throws Throwable {

	}

}