package com.tobias.orderservice.inner.domain;

import com.tobias.orderservice.inner.domain.vo.PayVo;
import com.tobias.orderservice.outer.dto.OrderRequest;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private long userid;

	@CreatedBy
	private Date createdAt;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@ToString.Exclude
	private Set<OrderItem> orderItems = new HashSet<>();

	@Embedded
	private PayVo payVo;

	public Order(OrderRequest orderRequest) {
		this.userid = orderRequest.getUserid();
		orderRequest.getOrderItemRequests().stream().map(OrderItem::new).collect(Collectors.toList());
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Order order = (Order) o;
		return id != null && Objects.equals(id, order.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}