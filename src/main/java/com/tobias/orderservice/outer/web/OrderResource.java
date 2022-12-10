package com.tobias.orderservice.outer.web;

����ũ�μ���.order.outer.web;

import ����ũ�μ���.order.inner.impl.OrderServiceImpl;

/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public class OrderResource {

	public OrderResource(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param orderRequest
	 */
	public ResponseEntity<String> orderRequest(OrderRequest orderRequest){
		return null;
	}

	/**
	 * 
	 * @param userid
	 */
	public ResponseEntity<List<OrderResponse>> orderResponse(long userid){
		return null;
	}

	/**
	 * 
	 * @param orderid
	 */
	public ResponseEntity<String> orderDelete(long orderid){
		return null;
	}

	/**
	 * 
	 * @param catalogname
	 */
	public ResponseEntity<List<OrderResponse>> orderSearchRequest(String catalogname){
		return null;
	}

	/**
	 * 
	 * @param orderitemid
	 */
	public ResponseEntity<String> purchaseConfirmRequest(long orderitemid){
		return null;
	}

}