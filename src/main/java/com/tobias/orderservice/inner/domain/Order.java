package com.tobias.orderservice.inner.domain;

import com.tobias.orderservice.inner.domain.vo.PayVo;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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