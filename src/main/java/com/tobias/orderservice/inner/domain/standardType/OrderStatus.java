package com.tobias.orderservice.inner.domain.standardType;

����ũ�μ���.order.inner.domain.standardType;

import ����ũ�μ���.order.inner.domain.vo.PayVo;

/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public enum OrderStatus {
	PAYED,
	PAYREQUESTED,
	PAYCANCELED;

	public PayVo m_PayVo;
}