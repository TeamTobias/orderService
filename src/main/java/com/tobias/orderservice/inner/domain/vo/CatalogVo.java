package com.tobias.orderservice.inner.domain.vo;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class CatalogVo {

	private long catalogid;
	private String name;
	private int quantity;
	private String color;
	private int size;
	private int unitPrice;

}