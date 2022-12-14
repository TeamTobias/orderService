package com.tobias.orderservice.outer.dto;

import lombok.Data;


@Data
public class OrderInfoPutRequest {

	private long id;
	private long userid;

	private DestinationInfoRequest destinationInfoRequest;

}