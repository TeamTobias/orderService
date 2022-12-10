package com.tobias.orderservice.outer.web;

����ũ�μ���.order.outer.web;

import ����ũ�μ���.order.inner.impl.OrderInfoServiceImpl;

/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public class OrderInfoResource {

	public OrderInfoResource(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param orderInfoRequest
	 */
	public ResponseEntity<String> orderInfoRequest(OrderInfoRequest orderInfoRequest){
		return null;
	}

	/**
	 * 
	 * @param userid
	 */
	public ResponseEntity<List<OrderInfoResponse>> orderInfoResponse(long userid){
		return null;
	}

	/**
	 * 
	 * @param orderInfoPutRequest
	 */
	public ResponseEntity<String> orderInfoPutRequest(OrderInfoPutRequest orderInfoPutRequest){
		return null;
	}

	/**
	 * 
	 * @param destinationInfoid
	 */
	public ResponseEntity<String> orderInfoDelete(long destinationInfoid){
		return null;
	}

}