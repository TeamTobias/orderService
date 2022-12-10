package com.tobias.orderservice.outer.dto;

import lombok.Data;


@Data
public class OrderInfoPutRequest {

	private long userid;
	private long destinationInfoid;
	private String name;
	private String phoneNum;
	private String address;
	private String addressDetail;


}