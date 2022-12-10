package com.tobias.orderservice.inner.service;

����ũ�μ���.order.inner.service;

import ����ũ�μ���.order.outer.dto.OrderInfoRequest;

/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public interface OrderInfoService {

	/**
	 * 
	 * @param orderInfoRequest
	 */
	public void orderInfoRequest(OrderInfoRequest orderInfoRequest);

	/**
	 * 
	 * @param userid
	 */
	public List<OrderInfoResponse> orderInfoResponse(long userid);

	/**
	 * 
	 * @param orderInfoPutRequest
	 */
	public void orderInfoPutRequest(OrderInfoPutRequest orderInfoPutRequest);

	/**
	 * 
	 * @param destinationInfoid
	 */
	public void orderInfoDelete(long destinationInfoid);

}