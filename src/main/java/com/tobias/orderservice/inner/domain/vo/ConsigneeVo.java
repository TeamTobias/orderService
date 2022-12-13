package com.tobias.orderservice.inner.domain.vo;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class ConsigneeVo {

	private String name;
	private String phoneNum;
}