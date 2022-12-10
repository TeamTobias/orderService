package com.tobias.orderservice.inner.domain;

import com.tobias.orderservice.inner.domain.vo.AddressVo;
import com.tobias.orderservice.inner.domain.vo.ConsigneeVo;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class DestinationInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private ConsigneeVo consigneeVo;

	@Embedded
	private AddressVo addressVo;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		DestinationInfo that = (DestinationInfo) o;
		return id != null && Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}