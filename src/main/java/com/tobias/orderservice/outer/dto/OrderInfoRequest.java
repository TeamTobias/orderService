package com.tobias.orderservice.outer.dto;

import com.tobias.orderservice.inner.domain.DestinationInfo;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class OrderInfoRequest {

	private long userid;

	private Set<DestinationInfoRequest> destinationInfoRequests;


}