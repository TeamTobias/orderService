package com.tobias.orderservice.outer.dto;

import lombok.Data;

@Data
public class OrderInfoRequest {

	private long userid;
	private String name;
	private String phoneNum;
	private String address;
	private String addressDetail;


}