package com.tobias.orderservice.inner.domain.vo;

import com.tobias.orderservice.outer.dto.ConsigneeVoRequest;
import com.tobias.orderservice.outer.dto.DestinationInfoRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsigneeVo implements Serializable {

	private String name;
	private String phoneNum;


	public ConsigneeVo(DestinationInfoRequest destinationInfoRequest) {
		this.name = destinationInfoRequest.getConsigneeVoRequest().getName();
		this.phoneNum = destinationInfoRequest.getConsigneeVoRequest().getPhoneNum();
	}

	public ConsigneeVo(ConsigneeVoRequest consigneeVoRequest) {
		this.name = consigneeVoRequest.getName();
		this.phoneNum = consigneeVoRequest.getPhoneNum();
	}
}