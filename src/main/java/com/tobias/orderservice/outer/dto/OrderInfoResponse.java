package com.tobias.orderservice.outer.dto;

import com.tobias.orderservice.inner.domain.DestinationInfo;
import com.tobias.orderservice.inner.domain.OrderInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfoResponse {

	private long id;
	private Set<DestinationInfo> destinationInfo;


	public OrderInfoResponse(OrderInfo orderInfo) {

		this.id = orderInfo.getId();
		this.destinationInfo = orderInfo.getDestinationInfos();

	}
}