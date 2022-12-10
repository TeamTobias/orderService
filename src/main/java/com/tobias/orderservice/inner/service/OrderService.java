package com.tobias.orderservice.inner.service; ����ũ�μ���.order.inner.service;


/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public interface OrderService {

	/**
	 * 
	 * @param orderRequest
	 */
	public void orderRequest(OrderRequest orderRequest);

	/**
	 * 
	 * @param userid
	 */
	public List<OrderResponse> orderResponse(long userid);

	/**
	 * 
	 * @param orderid
	 */
	public void orderDelete(long orderid);

	/**
	 * 
	 * @param catalogname
	 */
	public List<OrderResponse> orderSearchRequest(String catalogname);

	/**
	 * 
	 * @param orderitemid
	 */
	public void purchaseConfirmRequest(long orderitemid);

}