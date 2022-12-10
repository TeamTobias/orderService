package com.tobias.orderservice.inner.domain;


import com.tobias.orderservice.inner.domain.standardType.PurchaseConfirm;
import com.tobias.orderservice.inner.domain.vo.BrandVo;
import com.tobias.orderservice.inner.domain.vo.CatalogVo;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class OrderItem {

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private BrandVo brandVo;

	@Embedded
	private CatalogVo catalogVo;

	@Enumerated(EnumType.STRING)
	private PurchaseConfirm purchaseConfirm;


}