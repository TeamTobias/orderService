package com.tobias.orderservice.inner.domain;

����ũ�μ���.order.inner.domain;

import ����ũ�μ���.order.inner.domain.vo.ConsigneeVo;
import ����ũ�μ���.order.inner.domain.vo.AddressVo;

/**
 * @author ur2ku
 * @version 1.0
 * @created 10-12-2022 ���� 7:22:43
 */
public class DestinationInfo {

	private long id;
	private ConsigneeVo consigneeVo;
	private AddressVo addressVo;
	public AddressVo m_AddressVo;

	public DestinationInfo(){

	}

	public void finalize() throws Throwable {

	}

}