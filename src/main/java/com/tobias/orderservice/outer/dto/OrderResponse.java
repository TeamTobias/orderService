package com.tobias.orderservice.outer.dto; ����ũ�μ���.order.outer.dto;


/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public class OrderResponse {

	private long id;
	private Date createdAt;
	private int TotalPrice;
	private OrderStatus orderStatus;
	private List<OrderItemResponse> orderItemResponseList;

	public OrderResponse(){

	}

	public void finalize() throws Throwable {

	}

}