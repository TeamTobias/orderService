package com.tobias.orderservice.inner.domain; ����ũ�μ���.order.inner.domain;


/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public class Order {

	private long id;
	private long userid;
	private Date createdAt;
	public OrderItem orderItems;
	private PayVo payVo;
	public OrderItem m_OrderItem;

	public Order(){

	}

	public void finalize() throws Throwable {

	}

}