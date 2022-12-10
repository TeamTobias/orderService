package com.tobias.orderservice.inner.domain.vo;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class BrandVo {

	private long brandid;
	private String brandname;

}