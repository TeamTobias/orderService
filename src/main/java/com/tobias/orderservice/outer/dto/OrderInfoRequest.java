package com.tobias.orderservice.outer.dto;

import lombok.Data;

import java.util.Set;

@Data
public class OrderInfoRequest {

	private long userid;

	private Set<DestinationInfoRequest> destinationInfoRequests;


}