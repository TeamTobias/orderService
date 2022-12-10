package com.tobias.orderservice.inner.domain.vo;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class AddressVo {

	private String address;
	private String addressDetail;


}