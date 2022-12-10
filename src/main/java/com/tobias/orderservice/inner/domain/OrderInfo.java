package com.tobias.orderservice.inner.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class OrderInfo implements Serializable {
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private long userid;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@ToString.Exclude
	private Set<DestinationInfo> destinationInfos = new HashSet<>();


}