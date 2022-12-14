package com.tobias.orderservice.inner.domain.vo;

import com.tobias.orderservice.outer.dto.AddressVoRequest;
import com.tobias.orderservice.outer.dto.DestinationInfoRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class AddressVo implements Serializable {

	private String address;
	private String addressDetail;

	public AddressVo(DestinationInfoRequest destinationInfoRequest) {
		this.address = destinationInfoRequest.getAddressVoRequest().getAddress();
		this.addressDetail = destinationInfoRequest.getAddressVoRequest().getAddressDetail();
	}

	public AddressVo(AddressVoRequest addressVoRequest) {
		this.address = addressVoRequest.getAddress();
		this.addressDetail = addressVoRequest.getAddressDetail();
	}
}