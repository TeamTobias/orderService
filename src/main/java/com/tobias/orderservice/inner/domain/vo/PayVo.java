package com.tobias.orderservice.inner.domain.vo;

import com.tobias.orderservice.inner.domain.standardType.OrderStatus;
import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class PayVo {

	private OrderStatus orderStatus;

	private int totalPrice;

}