package com.tobias.orderservice.inner.domain.vo;

����ũ�μ���.order.inner.domain.vo;

import ����ũ�μ���.order.inner.domain.OrderItem;

/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public class CatalogVo {

	private long catalogid;
	private String name;
	private int quantity;
	private String color;
	private int size;
	private int unit_price;
	public OrderItem m_OrderItem;

	public CatalogVo(){

	}

	public void finalize() throws Throwable {

	}

}