package com.tobias.orderservice.inner.domain;


import com.tobias.orderservice.inner.domain.standardType.PurchaseConfirm;
import com.tobias.orderservice.inner.domain.vo.BrandVo;
import com.tobias.orderservice.inner.domain.vo.CatalogVo;
import com.tobias.orderservice.outer.dto.OrderItemRequest;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private BrandVo brandVo;

	@Embedded
	private CatalogVo catalogVo;

	@Enumerated(EnumType.STRING)
	private PurchaseConfirm purchaseConfirm;


	public OrderItem(OrderItemRequest orderItemRequest) {
		this.brandVo.setBrandid(orderItemRequest.getBrandid());
		this.brandVo.setBrandname(orderItemRequest.getBrandname());
		this.catalogVo.setCatalogid(orderItemRequest.getCatalogid());
		this.catalogVo.setName(orderItemRequest.getName());
		this.catalogVo.setQuantity(orderItemRequest.getQuantity());
		this.catalogVo.setColor(orderItemRequest.getColor());
		this.catalogVo.setSize(orderItemRequest.getSize());
		this.catalogVo.setUnitPrice(orderItemRequest.getUnitPrice());
	}
}